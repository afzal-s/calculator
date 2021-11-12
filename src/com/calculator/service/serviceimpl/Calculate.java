package com.calculator.service.serviceimpl;

import com.calculator.model.Inputs;
import com.calculator.service.ICalculationService;

public class Calculate implements ICalculationService {

	@Override
	public int add(Inputs userInput) {
		return userInput.getNumberOne() + userInput.getNumberTwo();
	}

	@Override
	public int subtract(Inputs userInput) {
		return userInput.getNumberOne() - userInput.getNumberTwo();
	}

	@Override
	public int multiply(Inputs userInput) {
		return userInput.getNumberOne() * userInput.getNumberTwo();
	}

	@Override
	public int divide(Inputs userInput) {
		return userInput.getNumberOne() / userInput.getNumberTwo();
	}

}
