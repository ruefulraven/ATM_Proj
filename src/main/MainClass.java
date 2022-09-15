package main;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		//dynamic - manghihingi ng input kay User
		//using switch, execute yung methods depende sa pipiliin ng user
		int userPin;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your pin: ");
		userPin = scanner.nextInt();
		Atm atm = new Atm(userPin);
		
		if(atm.checkPin(userPin)) {
			//run main functionalities
			System.out.println("1 - Deposit, 2- Withdraw, 3 - Print Receipt, 4 - Exit");
			int userInput = scanner.nextInt();
			atmFunctionalities(userInput, atm);
		}else {
			System.out.println("Sorry youre pin is invalid");
		}
		
		scanner.close();
	}
	
	public static void atmFunctionalities(int userInput, Atm tempAtm) {
		switch(userInput) {
			case 1:
				tempAtm.depositMoney(userInput);
				System.out.println("Youre current money is: ");
				tempAtm.printReceipt();
				break;
		}
		
	}
}
