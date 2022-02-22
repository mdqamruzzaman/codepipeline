package com.cts.codepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsCodepipelineApplication {

	@GetMapping(value = "/")
	public String hi() {
		return "Welcome to AWS Code Pipeline";
	}

	public static void main(String[] args) {
		SpringApplication.run(AwsCodepipelineApplication.class, args);
	}

}
