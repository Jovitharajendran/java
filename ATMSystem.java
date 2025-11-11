import java.util.*;

class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    void checkBalance() {
        System.out.println("💰 Your current balance: ₹" + balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("✅ ₹" + amount + " deposited successfully.");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("✅ ₹" + amount + " withdrawn successfully.");
        }
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM user = new ATM(5000.00);
        int choice;

        System.out.println("=== 💳 ATM MACHINE SYSTEM ===");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> user.checkBalance();
                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    user.deposit(dep);
                }
                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    user.withdraw(wd);
                }
                case 4 -> System.out.println("Thank you for using ATM!");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
        sc.close();
    }
}
