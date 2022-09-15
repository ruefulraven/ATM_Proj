package main;

public class Atm implements AtmMethods{

	private int userPin = 1509;
	private int userMoney = 50000;
	
	public Atm(int userPin, int userMoney) {
		this.userPin = userPin;
		this.userMoney = userMoney;
	}
	
	public Atm() {
		
	}
	
	public Atm(int userPin) {
		this.userPin = userPin; 
	}
	
	public int getUserPin() {
		return userPin;
	}
	
	public void setUserPin(int userPin) {
		this.userPin = userPin;
	}
	
	public int getUserMoney() {
		return userMoney;
	}
	
	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}

	@Override
	public void printReceipt() {
		System.out.println("Your current balance is: " + userMoney);	
	}

	@Override
	public int depositMoney(int tempMoney) {
		userMoney = userMoney + tempMoney;
		return userMoney;
	}
	
	@Override
	public int withdrawMoney(int tempMoney) throws Exception{
		userMoney = userMoney - tempMoney;
		if(tempMoney > userMoney) throw new Exception(" Invalid withdrawal amount");
		
		return userMoney;
	}

	@Override
	public void exitAtm() {
		System.out.println("Please get your card...");
	}

	@Override
	public boolean checkPin(int tempPin) {
		boolean isValidPin = tempPin == userPin ? true : false;
		System.out.println(isValidPin);
		return isValidPin;
	}
}
