package com.project.eclipse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.project.eclipse"})
public class EclipseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EclipseApplication.class, args);
	}

}
