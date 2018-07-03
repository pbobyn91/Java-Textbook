public class Account {
	private String name;
	private double balance;
	
	public Account (String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	public void deposit (double deposit) {
		if (deposit > 0.0) {
			balance += deposit;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}