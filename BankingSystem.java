class Account {
    String name;
    int accountNumber;

    Account(String n, int accNo) {
        name = n;
        accountNumber = accNo;
    }

    void displayAccount() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String n, int accNo, double b) {
        super(n, accNo);
        balance = b;
    }

    void displaySavingsAccount() {
        displayAccount();
        System.out.println("Savings Account Balance: " + balance);
    }
}

class CurrentAccount extends Account {
    double balance;

    CurrentAccount(String n, int accNo, double b) {
        super(n, accNo);
        balance = b;
    }

    void displayCurrentAccount() {
        displayAccount();
        System.out.println("Current Account Balance: " + balance);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    double interestRate;

    PremiumSavingsAccount(String n, int accNo, double b, double rate) {
        super(n, accNo, b);
        interestRate = rate;
    }

    void displayPremiumAccount() {
        displaySavingsAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount s =
            new SavingsAccount("Tanishaa", 101, 25000);

        CurrentAccount c =
            new CurrentAccount("Dhivya", 102, 40000);

        PremiumSavingsAccount p =
            new PremiumSavingsAccount("Anu", 103, 50000, 7.5);

        System.out.println("----- SAVINGS ACCOUNT -----");
        s.displaySavingsAccount();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        c.displayCurrentAccount();

        System.out.println("\n----- PREMIUM SAVINGS ACCOUNT -----");
        p.displayPremiumAccount();
    }
}