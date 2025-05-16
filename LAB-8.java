class LessBalanceException extends Exception {
    public LessBalanceException(double amount) {
        super("Withdraw amount (" + amount + " Rs) is not possible. ");
    }
}

class Account {
    double balance;
    static final double MIN_BALANCE = 500;

    public Account() {
        balance = MIN_BALANCE;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " Rs. New balance: " + balance + " Rs");
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < MIN_BALANCE) {
            throw new LessBalanceException(amount);
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " Rs. New balance: " + balance + " Rs");
    }

    public double getBalance() {
        return balance;
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();

        // Deposit money into both accounts
        account1.deposit(1000);
        account2.deposit(700);

        // Try to withdraw from account1
        try {
            account1.withdraw(1600);
        } catch (LessBalanceException e) {
            System.out.println("LessBalanceException: " + e.getMessage());
        }

        // Try to withdraw from account2
        try {
            account2.withdraw(200);
        } catch (LessBalanceException e) {
            System.out.println("LessBalanceException: " + e.getMessage());
        }
    }
}
