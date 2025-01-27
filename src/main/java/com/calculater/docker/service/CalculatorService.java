package com.calculater.docker.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	
	public int addNumbers(int a, int b) {
		
		return a+b;
	}
}
