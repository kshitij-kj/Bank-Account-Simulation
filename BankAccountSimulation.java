import java.util.ArrayList;
import java.util.Scanner;

// Base Account class
class Account {
    private String accountNumber;
    private String accountHolder;
    protected double balance;
    private ArrayList<String> transactionHistory;

    public Account(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        addTransaction("Account created with balance: ₹" + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("Deposited: ₹" + amount);
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            addTransaction("Withdrew: ₹" + amount);
            System.out.println("Successfully withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void printTransactionHistory() {
        System.out.println("\nTransaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    private void addTransaction(String detail) {
        transactionHistory.add(detail);
    }
}

// SavingsAccount class demonstrating inheritance & method overriding
class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest of ₹" + interest + " added to account.");
    }
}

// Main Class
public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample savings account
        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initBalance = scanner.nextDouble();
        System.out.print("Enter Interest Rate (%): ");
        double interestRate = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accNo, accHolder, initBalance, interestRate);

        boolean running = true;
        while (running) {
            System.out.println("\n===== Bank Account Menu =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Add Interest");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                }
                case 3 -> account.displayBalance();
                case 4 -> account.addInterest();
                case 5 -> account.printTransactionHistory();
                case 6 -> {
                    System.out.println("Exiting... Thank you for banking with us!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
