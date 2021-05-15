package com.aocm.sample.spbatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@Slf4j
public class SpbatchApplication {

	public static void main(String[] args) {
		log.info("start... {}", String.join(", ", args));
		ApplicationContext context = SpringApplication.run(SpbatchApplication.class, args);
		int exitCode = SpringApplication.exit(context);
		log.info("exit... {}", exitCode);
		System.exit(exitCode);
	}

}
