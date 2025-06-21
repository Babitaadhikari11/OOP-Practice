package Polymorphism;


class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

 
    public double calculateInterest() {
        System.out.println("Calculating interest for generic account.");
        return 0; // Default no interest
    }

    public void displayInterest() {
        System.out.println("Interest: $" + calculateInterest());
    }
}

// SavingsAccount class
class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public double calculateInterest() {
        
        return balance * INTEREST_RATE;
    }
}

class FixedDepositAccount extends Account {
    private static final double INTEREST_RATE = 0.07; // 7% annual interest
    private int termInYears;

    public FixedDepositAccount(double balance, int termInYears) {
        super(balance);
        this.termInYears = termInYears;
    }

    @Override
    public double calculateInterest() {
        // Compound interest for fixed deposit
        return balance * Math.pow(1 + INTEREST_RATE, termInYears) - balance;
    }
}


public class BankingApp {
    public static void main(String[] args) {
        Account genericAccount = new Account(1000);
        SavingsAccount savings = new SavingsAccount(1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount(1000, 3);

        System.out.println("Generic Account:");
        genericAccount.displayInterest();

        System.out.println("\nSavings Account:");
        savings.displayInterest();

        System.out.println("\nFixed Deposit Account:");
        fixedDeposit.displayInterest();
    }
}