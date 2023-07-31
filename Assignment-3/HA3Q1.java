import java.util.Scanner;

class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message) {
        super(message);
    }
}

class Bank {
    private int account_no;
    private String name;
    private double balance;

    public Bank(int account_no, String name, double balance) throws InvalidBalanceException {
        if (balance <= 0) {
            throw new InvalidBalanceException("Balance cannot be less than 0");
        }else{
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("After withdraw, Balance = " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayDetails() {
        System.out.println("Details of the Account Holder");
        System.out.println("Name: " + name);
        System.out.println("Account number: " + account_no);
        System.out.println("Balance: " + balance);
    }
}

public class HA3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter Account number:");
        int account_no = scanner.nextInt();

        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();

        try {
            Bank bank = new Bank(account_no, name, balance);
            bank.displayDetails();

            System.out.println("Enter the money to withdraw:");
            double amount = scanner.nextDouble();
            bank.withdraw(amount);
        } catch (InvalidBalanceException e) {
            System.out.println("InvalidBalanceException: " + e);
        }

        scanner.close();
    }
}
