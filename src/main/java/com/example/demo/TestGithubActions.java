package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGithubActions {

	@GetMapping("/")
	public String name()
	{
		return "sai";
	}
	
	@PostMapping("/add/{value1}/{value2}")
	public int sum(@PathVariable int value1, @PathVariable int value2) {
		return value1+value2;
	}
	
	@GetMapping("/firstNames")
	public String firstName()
	{
		return "phani";
	}
	
}
