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

    @Autowired
    TaskSearchRepository taskSearchRepository;

  public TaskEntity findLatestTask() {
    val task = taskSearchRepository.findLatest();
    return task.get();
  }
}
