package com.aocm.taskapp.domain.task;

public interface TaskCommandRepository {
  void resistor(TaskEntity task);

  void done(TaskEntity task);
}
