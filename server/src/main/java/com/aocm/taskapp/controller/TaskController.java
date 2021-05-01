package com.aocm.taskapp.controller;

import com.aocm.taskapp.usecase.TaskUseCase;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

  @Autowired TaskUseCase taskUseCase;

  @GetMapping("/latest")
  public TaskResponse findLatestTask() {
    val task = taskUseCase.findLatestTask();
    return new TaskResponse(task);
  }
}
