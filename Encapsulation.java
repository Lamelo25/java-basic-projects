class Bank{
	// int balance=100_000;
	private int balance;

	public int getBalance(){
		return balance;
	}

	public void setBalance(int balance){
		this.balance=balance;
	}
}
public class Encapsulation{
	public static void main(String[] args) {
		Bank bank = new Bank();

		System.out.println(bank.getBalance());

		bank.setBalance(5_000);

		System.out.println(bank.getBalance());
	}
}