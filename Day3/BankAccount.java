package Day3;

public class BankAccount {
    private static int accountCounter = 0;
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
        accountCounter++;
    }

    public static int getAccountCounter() {
        return accountCounter;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
        } else {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (amount > balance || amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            this.balance -= amount;
        }
    }
}
