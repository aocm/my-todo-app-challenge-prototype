package com.aocm.taskapp.controller;

import com.aocm.taskapp.domain.task.TaskEntity;
import com.aocm.taskapp.usecase.SampleService;
import lombok.val;
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

  @GetMapping("/latest")
  public TaskResponse findLatestTask() {
    val task = new TaskEntity("sample title", "sample description");
    task.register();
    return new TaskResponse(task);
  }
}
