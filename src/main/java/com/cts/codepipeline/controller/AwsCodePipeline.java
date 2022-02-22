package com.cts.codepipeline.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsCodePipeline {

	@PostMapping(value = "/welcome")
	public String welcome(@RequestBody String name) {
		return name + "Welcome to the AWS Code Pipeline";
	}
}
