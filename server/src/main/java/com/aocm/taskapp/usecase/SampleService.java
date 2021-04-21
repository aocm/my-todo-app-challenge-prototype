package com.aocm.taskapp.usecase;

import com.aocm.taskapp.domain.task.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

  @Autowired SampleRepository sampleRepository;

  public String getText() {
    return sampleRepository.getSampleAction();
  }
}
