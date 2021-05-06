package com.aocm.taskapp.usecase.repository;

import com.aocm.taskapp.domain.task.TaskEntity;
import java.util.Optional;

public interface TaskSearchRepository {
  Optional<TaskEntity> findLatest();
}
