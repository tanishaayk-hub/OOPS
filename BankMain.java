import java.util.InputMismatchException;
import java.util.Scanner;

// User-defined exception
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {

    // Balance attribute
    double balance;

    // Constructor to initialize balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to withdraw amount
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Check whether withdrawal amount exceeds balance
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal amount exceeds available balance."
            );
        }

        // Deduct withdrawal amount
        balance = balance - amount;

        // Display updated balance
        System.out.println("Withdrawal successful.");
        System.out.println("Updated Balance: " + balance);
    }
}

// Main class
public class BankMain {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        try {
            // Read initial account balance
            System.out.print("Enter initial account balance: ");
            double initialBalance = sc.nextDouble();

            // Create BankAccount object
            BankAccount account = new BankAccount(initialBalance);

            // Read withdrawal amount
            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            // Invoke withdraw() method
            account.withdraw(amount);
        }

        // Handle invalid non-numeric input
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }

        // Handle insufficient balance
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        // Execute finally block
        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}