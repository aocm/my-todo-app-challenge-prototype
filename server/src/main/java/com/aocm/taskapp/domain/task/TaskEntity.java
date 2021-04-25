package com.aocm.taskapp.domain.task;

import lombok.Getter;

@Getter
public class TaskEntity {

  public TaskEntity(String title, String description) {
    this.taskId = "todo"; // TODO
    this.title = title;
    this.description = description;
    this.status = "start";
  }

  private String taskId;
  private String title;
  private String description;
  private String status; // "start" or "done"
}
