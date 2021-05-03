package com.aocm.taskapp.infrastructure.repository;

import com.aocm.taskapp.domain.task.TaskEntity;
import com.aocm.taskapp.usecase.repository.TaskSearchRepository;
import java.util.Optional;
import lombok.val;
import org.springframework.stereotype.Repository;

@Repository
public class TaskSearchRepositoryImpl implements TaskSearchRepository {
  public Optional<TaskEntity> findLatest() {
    val task = Optional.of(new TaskEntity("sample title", "sample description"));
    return task;
  }
}
