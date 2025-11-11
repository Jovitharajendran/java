import java.util.*;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();

        // Predefined users
        users.put("admin", "admin123");
        users.put("jovitha", "java2025");
        users.put("guest", "guest123");

        System.out.println("=== Simple Login Authentication System ===");
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            String uname = sc.nextLine();
            System.out.print("Enter Password: ");
            String pass = sc.nextLine();

            if (users.containsKey(uname) && users.get(uname).equals(pass)) {
                System.out.println("✅ Login Successful! Welcome, " + uname + "!");
                break;
            } else {
                attempts--;
                System.out.println("❌ Invalid credentials. Attempts left: " + attempts);
                if (attempts == 0)
                    System.out.println("Account Locked. Try again later.");
            }
        }

        sc.close();
    }
}
