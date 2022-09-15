package main;

public interface AtmMethods {
	public void printReceipt();
	public int depositMoney(int tempMoney);
	public int withdrawMoney(int tempMoney) throws Exception;
	public boolean checkPin(int tempPin);
	public void exitAtm();
}
