package com.aocm.taskapp.usecase;

import com.aocm.taskapp.domain.task.TaskEntity;
import com.aocm.taskapp.usecase.repository.TaskSearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TaskUseCase {

  @Autowired TaskSearchRepository taskSearchRepository;

  public TaskEntity findLatestTask() {
    val task = taskSearchRepository.findLatest();
    return task.get();
  }

  public void taskDone(String id) throws Exception {
    val task = taskSearchRepository.findLatest().orElseThrow(Exception::new);
    task.done();
  }

  public void registerNewTask(String title, String description) throws Exception {
    val task = new TaskEntity(title, description);
    task.register();
  }
}
