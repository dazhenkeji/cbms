package com.dazhenkeji.cbms.loginManage.entity;

import java.io.Serializable;

/**
 * @ClassName user
 * @Description
 * @Author hp
 * @Date 2019/4/914:23
 **/
public class user implements Serializable {
    //用户名（ID）
    public String userId;
    //用户名称
    public String userName;
    //开户手机
    public String accountPhone;
    //用户角色
    public String userRole;
    //密码
    public String passWd;
    //身份证
    public String idCard;
    //银行名称
    public String bankName;
    //银行账号
    public String bankAccount;
    //激活状态 0:未激活 1:激活
    public Character activationStatus;
    //锁定状态 0:未锁定 1:锁定
    public Character lockStatus;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPassWd() {
        return passWd;
    }

    public void setPassWd(String passWd) {
        this.passWd = passWd;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Character getActivationStatus() {
        return activationStatus;
    }

    public void setActivationStatus(Character activationStatus) {
        this.activationStatus = activationStatus;
    }

    public Character getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Character lockStatus) {
        this.lockStatus = lockStatus;
    }
}
