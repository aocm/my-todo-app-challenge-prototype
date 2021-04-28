package com.aocm.taskapp;

import org.springframework.context.ApplicationContext;

public class ApplicationContextUtils {

  private static ApplicationContext context;

  public static ApplicationContext getContext() {
    return ApplicationContextUtils.context;
  }

  public static void setContext(ApplicationContext context) {
    if (ApplicationContextUtils.context != null) {
      return;
    }
    ApplicationContextUtils.context = context;
  }
}
