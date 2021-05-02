package com.aocm.taskapp.domain.task;

import com.aocm.taskapp.ApplicationContextUtils;
import lombok.Getter;
import org.springframework.context.ApplicationContext;

public class TaskEntity {
  public TaskEntity(String title, String description) {
    this.taskId = "todo"; // TODO
    this.title = new TaskTitle(title);
    this.description = description;
    this.status = TaskStatus.UNDONE;
    ApplicationContext context = ApplicationContextUtils.getContext();
    this.repository = context.getBean(TaskCommandRepository.class);
  }

  TaskCommandRepository repository;

  @Getter private String taskId;
  @Getter private TaskTitle title;
  @Getter private String description;
  @Getter private TaskStatus status; // "start" or "done"

  public void register() {
    this.repository.resistor(this);
  }

  public void done() {
    this.repository.done(this);
  }
}
