package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGithubActions {

	@GetMapping("/")
	public String name()
	{
		return "sai";
	}
}
