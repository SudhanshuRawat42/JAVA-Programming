package exercise1;

public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    public synchronized void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            System.out.printf("%s deposited: $%.2f | New balance: $%.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    public synchronized void withdraw(double amount) {
        if (amount > 0.0 && amount <= balance) {
            balance -= amount;
            System.out.printf("%s withdrew: $%.2f | New balance: $%.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        } else {
            System.out.printf("%s attempted to withdraw $%.2f | Insufficient funds! Balance: $%.2f%n",
                    Thread.currentThread().getName(), amount, balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
