package com.aocm.taskapp.domain.task;

import com.aocm.taskapp.ApplicationContextUtils;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

@Getter
public class TaskEntity {

  public TaskEntity(String title, String description) {
    this.taskId = "todo"; // TODO
    this.title = title;
    this.description = description;
    this.status = "start";
    ApplicationContext context = ApplicationContextUtils.getContext();
    this.repository = context.getBean(SampleRepository.class);
  }

  @Autowired SampleRepository repository;

  private String taskId;
  private String title;
  private String description;
  private String status; // "start" or "done"

  public void register() {
    // todo リポジトリ 修正
    this.repository.getSampleAction();
  }

  public void done() {
    // todo リポジトリ 修正
    this.repository.getSampleAction();
  }
}
