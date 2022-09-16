package main;

import java.util.Scanner;

public class MainClass {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		//dynamic - manghihingi ng input kay User
		//using switch, execute yung methods depende sa pipiliin ng user
		int userPin;
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
	
	public static void atmFunctionalities(int userInput, Atm tempAtm) throws Exception {
		switch(userInput) {
			case 1:
				System.out.println("How much money you want to deposit");
				int moneyToDeposit = scanner.nextInt();
				tempAtm.depositMoney(moneyToDeposit);
				System.out.println("Youre current money is: ");
				tempAtm.printReceipt();
				break;
			case 2:
				System.out.println("How much money you want to deposit");
				int moneyToWithdraw = scanner.nextInt();
				tempAtm.withdrawMoney(moneyToWithdraw);
				System.out.println("Youre current money is: ");
				tempAtm.printReceipt();
				break;
			case 3:
				System.out.println("Youre current money is: ");
				tempAtm.printReceipt();
				break;
			case 4:
				System.out.println("Bye Bye ");
				break;
		}
		
	}
}
