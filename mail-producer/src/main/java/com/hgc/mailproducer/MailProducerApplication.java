package com.hgc.mailproducer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.hgc")
@EnableWebMvc
@MapperScan("com.hgc.common.mapper")
public class MailProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailProducerApplication.class, args);
    }

}
