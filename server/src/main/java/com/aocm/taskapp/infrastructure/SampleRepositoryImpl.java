package com.aocm.taskapp.infrastructure;

import com.aocm.taskapp.domain.task.SampleRepository;
import org.springframework.stereotype.Repository;

@Repository
public class SampleRepositoryImpl implements SampleRepository {
  public String getSampleAction() {
    System.out.println("impl");
    return "impl";
  }
}
