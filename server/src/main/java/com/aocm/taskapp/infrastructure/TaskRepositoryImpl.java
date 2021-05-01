package com.aocm.taskapp.infrastructure;

import com.aocm.taskapp.domain.task.TaskEntity;
import com.aocm.taskapp.domain.task.TaskRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
  public void resistor(TaskEntity task) {
    System.out.println("resistor");
  }

  public void done(TaskEntity task) {
    System.out.println("done");
  }
}
