package com.calculater.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.calculater.docker.service.CalculatorService;

@RestController
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;
	
	@GetMapping("/add/{a}/{b}")
	public int add(@PathVariable int a,@PathVariable int b) {
		return calculatorService.addNumbers(a, b);
	}
	
}
