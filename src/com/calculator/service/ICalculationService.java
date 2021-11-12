package com.calculator.service;

import com.calculator.model.Inputs;

public interface ICalculationService {
	public int add(Inputs userInput);
	public int subtract(Inputs userInput);
	public int multiply(Inputs userInput);
	public int divide(Inputs userInput);
}
