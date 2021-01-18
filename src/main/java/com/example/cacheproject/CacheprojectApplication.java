package com.example.cacheproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class CacheprojectApplication {

  public static void main(String[] args) {
    SpringApplication.run(CacheprojectApplication.class, args);
  }

}
