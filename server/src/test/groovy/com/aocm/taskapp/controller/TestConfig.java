package com.aocm.taskapp.controller;

import com.aocm.taskapp.domain.task.TaskCommandRepository;
import com.aocm.taskapp.domain.task.TaskEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.aocm.taskapp")
public class TestConfig {

  @Primary
  @Bean
  TaskCommandRepository getTaskRepository() {
    return new TaskCommandRepository() {
      @Override
      public void resistor(TaskEntity task) {
        System.out.println("test resistor");
      }

      @Override
      public void done(TaskEntity task) {
        System.out.println("test resistor");
      }
    };
  }
}
