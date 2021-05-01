package com.aocm.taskapp.usecase;

import com.aocm.taskapp.domain.task.TaskEntity;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class TaskUseCase {
  public TaskEntity findLatestTask() {
    val task = new TaskEntity("sample title", "sample description");
    task.register(); // todo 削除
    task.done(); //  todo 削除
    return task;
  }
}
