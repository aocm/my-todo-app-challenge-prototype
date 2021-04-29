package com.aocm.taskapp.domain.task;

import lombok.Getter;

@Getter
public class TaskStatus {
  public TaskStatus() {
    this.value = "start";
  }

  private String value;

  public void nextStatus() {
    if (this.value == "start") {
      this.value = "done";
    }
  }
}
