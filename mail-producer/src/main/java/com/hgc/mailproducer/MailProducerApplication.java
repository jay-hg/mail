package com.hgc.mailproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.hgc")
@EnableWebMvc
public class MailProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MailProducerApplication.class, args);
    }

}
