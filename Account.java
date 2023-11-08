package task10;

public class Account {
	private double balance ;
	
 	public Account() {
        balance = balance;
    }
 	public Account(double initialBalance) {
 		balance=initialBalance;
	}
 	public void setBalance(double newBalance) {
 		balance = newBalance;
 	}
 	
 	public double getBalance() {
 		return balance;
 	}
 	public void deposit(double amount) {
 		balance= balance+ amount;
 	}
 	
 	 
 	
 	public void withdraw(double amount) {
 		if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance!");
        }
 	}

	public static void main(String[] args) {
		Account account = new Account(); // No-argument constructor
		System.out.println("Current Balance: " + account.getBalance());

		account.deposit(1000.0);
		System.out.println("Balance after deposit: " + account.getBalance());

		account.withdraw(300.0);
		System.out.println("Balance after withdrawal: " + account.getBalance());
	}
}

	
