package com.aocm.taskapp.domain.task;

public interface TaskRepository {
  void resistor(TaskEntity task);

  void done(TaskEntity task);
}
