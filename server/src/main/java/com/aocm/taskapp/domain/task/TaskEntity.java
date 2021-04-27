package com.aocm.taskapp.domain.task;

import lombok.Getter;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Getter
public class TaskEntity {

  public TaskEntity(String title, String description) {
    this.taskId = "todo"; // TODO
    this.title = title;
    this.description = description;
    this.status = "start";
    val ctx = new AnnotationConfigApplicationContext();
    ctx.scan("com.aocm.taskapp");
    ctx.refresh();
    this.repository = ctx.getBean(SampleRepository.class);
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
