package com.calculator.userinterface;

import com.calculator.model.Inputs;
import com.calculator.service.ICalculationService;
import com.calculator.service.serviceimpl.Calculate;
import com.calculator.utility.UScanner;

public class UIControl {

	private UIControl() {}

	public static UIControl getInstance() {
		return new UIControl();
	}

	private static final ICalculationService CALCI = new Calculate();
	private static final Inputs userInput = new Inputs();

	public void menuRun() {
		int choice;
		do {
			choice = getChoice();
			switch (choice) {
			case 1:
				userInput();
				System.out.println("Add: " + CALCI.add(userInput));
				break;
			case 2:
				userInput();
				System.out.println("Subtract: " + CALCI.subtract(userInput));
				break;
			case 3:
				userInput();
				System.out.println("Multipy: " + CALCI.multiply(userInput));
				break;
			case 4:
				userInput();
				System.out.println("Divide: " + CALCI.divide(userInput));
				break;
			case 5:
				System.out.println("Thankyou..");
				break;
			default:
				System.out.println("Select Proper Option");
				break;
			}
		} while (choice != 5);
	}

	public int getChoice() {
		System.out.println("1. Add \n" + "2. Subtract \n" + "3. Multipy \n" + "4. Divide \n" + "5. Exit \n");
		int choice = UScanner.getInt();
		return choice;
	}

	private static void userInput() {
		System.out.print("Enter First Number: ");
		userInput.setNumberOne(UScanner.getInt());
		System.out.print("Enter Second Number: ");
		userInput.setNumberTwo(UScanner.getInt());
	}

}
