package com.hgc.mailconsumer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.hgc")
@MapperScan("com.hgc.common.mapper")
public class MailConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailConsumerApplication.class, args);
    }

}
