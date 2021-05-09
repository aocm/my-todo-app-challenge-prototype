package com.aocm.taskapp.presentation.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PutTaskRequest {
  private String id;
  private String title;
  private String description;
}
