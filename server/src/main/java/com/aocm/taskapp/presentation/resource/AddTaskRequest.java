package com.aocm.taskapp.presentation.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddTaskRequest {
  private String title;
  private String description;
}
