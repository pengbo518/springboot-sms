package com.pengbo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: sms
 * @author: Mr.Liu
 * @version: v1.0
 * @create: 2019-07-03 23:46
 **/
@SpringBootApplication
public class SmsApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SmsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务启动完成...");
    }
}
