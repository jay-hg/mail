package com.hgc.mailconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.hgc")
@EnableWebMvc
public class MailConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailConsumerApplication.class, args);
    }

}
