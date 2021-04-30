package com.aocm.taskapp.domain.task;

import com.aocm.taskapp.ApplicationContextUtils;
import lombok.Getter;
import org.springframework.context.ApplicationContext;

@Getter
public class TaskEntity {
  public TaskEntity(String title, String description) {
    this.taskId = "todo"; // TODO
    this.title = new TaskTitle(title);
    this.description = description;
    this.status = TaskStatus.UNDONE;
    ApplicationContext context = ApplicationContextUtils.getContext();
    this.repository = context.getBean(SampleRepository.class);
  }

  SampleRepository repository;

  private String taskId;
  private TaskTitle title;
  private String description;
  private TaskStatus status; // "start" or "done"

  public void register() {
    // todo リポジトリ 修正
    this.repository.getSampleAction();
  }

  public void done() {
    // todo リポジトリ 修正
    this.repository.getSampleAction();
  }
}
