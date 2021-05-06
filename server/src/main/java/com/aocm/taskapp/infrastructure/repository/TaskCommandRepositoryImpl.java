package com.aocm.taskapp.infrastructure.repository;

import com.aocm.taskapp.domain.task.TaskCommandRepository;
import com.aocm.taskapp.domain.task.TaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TaskCommandRepositoryImpl implements TaskCommandRepository {
  public void resistor(TaskEntity task) {
    System.out.println(
        "resistor... "
            + task.getTaskId()
            + " / "
            + task.getStatus()
            + " / "
            + task.getTitle().getValue()
            + " / "
            + task.getDescription());
  }

  public void done(TaskEntity task) {
    System.out.println("done");
  }
}
