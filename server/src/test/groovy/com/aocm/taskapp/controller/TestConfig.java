package com.aocm.taskapp.controller;

import com.aocm.taskapp.domain.task.SampleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.aocm.taskapp")
public class TestConfig {

  @Primary
  @Bean
  SampleRepository getSampleRepository() {
    return new SampleRepository() {
      @Override
      public String getSampleAction() {
        return "test!";
      }
    };
  }
}
