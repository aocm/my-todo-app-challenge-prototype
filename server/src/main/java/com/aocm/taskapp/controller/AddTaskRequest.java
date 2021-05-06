package com.aocm.taskapp.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddTaskRequest {
  private String title;
  private String description;
}
