package com.aocm.taskapp.controller;

import com.aocm.taskapp.domain.task.TaskEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponse {

  TaskResponse(TaskEntity task) {
    this.taskId = task.getTaskId();
    this.title = task.getTitle().getValue();
    this.description = task.getDescription();
    this.status = task.getStatus().getValue();
  }

  private String taskId;
  private String title;
  private String description;
  private String status;
}
