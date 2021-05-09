package com.aocm.taskapp.presentation.resource;

import com.aocm.taskapp.domain.task.TaskEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskResponse {

  public TaskResponse(TaskEntity task) {
    this.taskId = task.getTaskId();
    this.title = task.getTitle().getValue();
    this.description = task.getDescription();
    this.status = task.getStatus().toString();
  }

  private String taskId;
  private String title;
  private String description;
  private String status;
}
