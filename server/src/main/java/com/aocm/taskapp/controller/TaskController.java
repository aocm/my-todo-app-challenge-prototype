package com.aocm.taskapp.controller;

import com.aocm.taskapp.usecase.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

  @Autowired SampleService sampleService;

  @GetMapping
  public String sample() {
    return sampleService.getText();
  }
}
