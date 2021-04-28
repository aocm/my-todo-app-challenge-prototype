package com.aocm.taskapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aocm.taskapp"})
public class Application {

  public static void main(String[] args) {
    ApplicationContextUtils.setContext(SpringApplication.run(Application.class, args));
  }
}
