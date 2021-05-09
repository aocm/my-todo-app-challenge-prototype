package com.aocm.taskapp.presentation.controller;

import com.aocm.taskapp.presentation.resource.AddTaskRequest;
import com.aocm.taskapp.presentation.resource.PutTaskRequest;
import com.aocm.taskapp.presentation.resource.TaskResponse;
import com.aocm.taskapp.usecase.TaskUseCase;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

  @Autowired TaskUseCase taskUseCase;

  @GetMapping("/latest")
  public TaskResponse findLatestTask() {
    val task = taskUseCase.findLatestTask();
    return new TaskResponse(task);
  }

  @PutMapping("/done")
  public void done(@RequestBody PutTaskRequest task) throws Exception {
    taskUseCase.taskDone(task.getId());
  }

  @PostMapping
  public void addNewTask(@RequestBody AddTaskRequest task) throws Exception {
    System.out.println("addNewTask");
    taskUseCase.registerNewTask(task.getTitle(), task.getDescription());
  }
}
