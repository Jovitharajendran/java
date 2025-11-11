import java.util.*;

class Employee {
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double tax = 0.08 * basicSalary;
        return basicSalary + hra + da - tax;
    }

    void display() {
        System.out.println(id + "\t" + name + "\t" + basicSalary + "\t" + calculateNetSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Basic Salary: ");
                double sal = sc.nextDouble();
                employees.add(new Employee(id, name, sal));
                System.out.println("✅ Employee added successfully!");
            } else if (choice == 2) {
                System.out.println("ID\tName\tBasic\tNetSalary");
                for (Employee e : employees)
                    e.display();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}
