package com.dazhenkeji;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dazhenkeji.cbms.*.mapper")  
public class CbmsApplication {

    public static void main(String[] args) {

        SpringApplication.run(CbmsApplication.class, args);
    }

}
