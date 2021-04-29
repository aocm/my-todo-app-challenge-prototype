package com.aocm.taskapp.domain.task;

import javax.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TaskTitle {
  public TaskTitle(String title) {
    this.value = title;
  }

  @NotNull private String value;
}
