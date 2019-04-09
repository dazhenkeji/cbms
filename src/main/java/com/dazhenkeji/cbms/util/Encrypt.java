package com.dazhenkeji.cbms.util;

import java.security.Key;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * 加密工具类
 * @ClassName: Encrypt
 * @Description: TODO
 * @author Comsys-zhangbin
 * @date 2015-6-15 上午11:29:06
 */
public class Encrypt {
    private static String strDefaultKey = "!nsv@com#cn$";
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;
    private static Encrypt encrypt = null;

    /**
     * @Title:Encrypt
     * @Description:构造函数
     * @throws Exception
     */
    public Encrypt() throws Exception {
        this(strDefaultKey);
    }
    /**
     * @Title:Encrypt
     * @Description:加密
     * @param paramString
     * @throws Exception
     */
    public Encrypt(String paramString) throws Exception {
        Security.addProvider(getProvider());
        Key localKey = getKey(paramString.getBytes());
        this.encryptCipher = Cipher.getInstance("DES");
        this.encryptCipher.init(1, localKey);
        this.decryptCipher = Cipher.getInstance("DES");
        this.decryptCipher.init(2, localKey);
    }
    /**
     * @Title: getInstance
     * @Description: 获取单例加密工具类
     * @return
     * @return: Encrypt
     */
    public static Encrypt getInstance() {
        try {
            if (encrypt == null) {
                return new Encrypt();
            } else {
                return encrypt;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * @Title: byteArr2HexStr
     * @Description: 将byte数组转换为表示16进制值的字符串， 如：byte[]{8,18}转换为：0813
     * @param paramArrayOfByte 需要转换的byte数组
     * @return 转换后的字符串
     * @throws Exception
     * @return: String
     */
    private static String byteArr2HexStr(byte[] paramArrayOfByte) throws Exception {
        int i = paramArrayOfByte.length;
        StringBuffer localStringBuffer = new StringBuffer(i * 2);
        for (int j = 0; j < i; j++) {
            int k = paramArrayOfByte[j];
            while (k < 0)
                k += 256;
            if (k < 16)
                localStringBuffer.append("0");
            localStringBuffer.append(Integer.toString(k, 16));
        }
        return localStringBuffer.toString();
    }
    /**
     * @Title: hexStr2ByteArr
     * @Description: 将表示16进制值的字符串转换为byte数组
     * @param paramString 需要转换的字符串
     * @return 转换后的byte数组
     * @throws Exception
     * @return: byte[]
     */
    private static byte[] hexStr2ByteArr(String paramString) throws Exception {
        byte[] arrayOfByte1 = paramString.getBytes();
        int i = arrayOfByte1.length;
        byte[] arrayOfByte2 = new byte[i / 2];
        int j = 0;
        while (j < i) {
            String str = new String(arrayOfByte1, j, 2);
            arrayOfByte2[(j / 2)] = ((byte) Integer.parseInt(str, 16));
            j += 2;
        }
        return arrayOfByte2;
    }
    /**
     * @Title: encrypt
     * @Description: 加密字节数组
     * @param paramArrayOfByte 需加密的字节数组
     * @return 加密后的字节数组
     * @throws Exception
     * @return: byte[]
     */
    private byte[] encrypt(byte[] paramArrayOfByte) throws Exception {
        return this.encryptCipher.doFinal(paramArrayOfByte);
    }
    /**
     * @Title: getProvider
     * @Description: 获取位置信息的基本方法
     * @return
     * @return: Provider
     */
    private Provider getProvider() {
        String str1 = System.getProperty("java.vm.name");
        str1 = str1.toLowerCase();
        Provider localProvider = null;
        String str2 = null;
        if (str1.startsWith("sun"))
            str2 = "com.sun.crypto.provider.SunJCE";
        else if (str1.startsWith("ibm"))
            str2 = "com.ibm.crypto.provider.IBMJCE";
        else if (str1.startsWith("oracle"))
            str2 = "com.sun.crypto.provider.SunJCE";
        else
            str2 = "com.sun.crypto.provider.SunJCE";
        if (str2 != null)
            try {
                localProvider = (Provider) Class.forName(str2).newInstance();
            } catch (IllegalAccessException localIllegalAccessException) {
                localIllegalAccessException.printStackTrace();
            } catch (InstantiationException localInstantiationException) {
                localInstantiationException.printStackTrace();
            } catch (ClassNotFoundException localClassNotFoundException) {
                localClassNotFoundException.printStackTrace();
            }
        return localProvider;
    }
    /**
     * @Title: encrypt
     * @Description: 加密字符串
     * @param paramString 需加密的字符串
     * @return 加密后的字节数组
     * @return: String
     */
    public String encrypt(String paramString) {
        try {
            return byteArr2HexStr(encrypt(paramString.getBytes()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paramString;
    }
    /**
     * @Title: decrypt
     * @Description: 解密字节数组
     * @param paramArrayOfByte 需解密的字节数组
     * @return 解密后的字节数组
     * @throws Exception
     * @return: byte[]
     */
    private byte[] decrypt(byte[] paramArrayOfByte) throws Exception {
        return this.decryptCipher.doFinal(paramArrayOfByte);
    }
    /**
     * @Title: decrypt
     * @Description: 解密字符串
     * @param paramString 需解密的字符串
     * @return 解密后的字符串
     * @return: String
     */
    public String decrypt(String paramString) {
        try {
            return new String(decrypt(hexStr2ByteArr(paramString)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paramString;
    }
    /**
     * @Title: getKey
     * @Description: 从指定字符串生成密钥，密钥所需的字节数组长度为8位 不足8位时后面补0，超出8位只取前8位
     * @param paramArrayOfByte 构成该字符串的字节数组
     * @return 生成的密钥
     * @throws Exception
     * @return: Key
     */
    private Key getKey(byte[] paramArrayOfByte) throws Exception {
        byte[] arrayOfByte = new byte[8];
        for (int i = 0; (i < paramArrayOfByte.length) && (i < arrayOfByte.length); i++)
            arrayOfByte[i] = paramArrayOfByte[i];
        SecretKeySpec localSecretKeySpec = new SecretKeySpec(arrayOfByte, "DES");
        return localSecretKeySpec;
    }
    /**
     * @Title: encodeByMD5
     * @Description: 将字符串加密成32位长度的MD5码
     * @param text 待加密的字符串
     * @return 加密后的字符串
     * @return: String
     */
    public static String encodeByMD5(final String text) {
        String after = text;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(text.getBytes("US-ASCII"));
            byte[] digest = md.digest();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                sb.append(Character.forDigit((digest[i] & 0xF0) >> 4, 16));
                sb.append(Character.forDigit((digest[i] & 0xF), 16));
            }
            after = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return after;
    }
    // 测试主函数
    public static void main(String args[]) {
        String s = new String("123456");
        System.out.println("原始：" + s);
        String es = Encrypt.getInstance().encrypt(s);
        System.out.println("加密：" + es);
        System.out.println("解密：" + Encrypt.getInstance().decrypt(es));
    }
}
