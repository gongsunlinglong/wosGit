package com.asde.csl.gift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftApplication.class, args);
    }
}
