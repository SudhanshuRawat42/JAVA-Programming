package exercise2;

import java.util.Scanner;

public class GameTesterTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the game tester: ");
        String name = scanner.nextLine();

        System.out.print("Is the tester full-time? (yes/no): ");
        String type = scanner.nextLine();

        GameTester tester;

        if (type.equalsIgnoreCase("yes")) {
            tester = new FullTimeGameTester(name);
        } else {
            System.out.print("Enter the number of hours worked: ");
            int hoursWorked = scanner.nextInt();
            tester = new PartTimeGameTester(name, hoursWorked);
        }

        System.out.println("Tester Name: " + tester.getName());
        System.out.println("Full-Time Status: " + (tester.isFullTime() ? "Yes" : "No"));
        System.out.println("Part-Time Status: " + (tester.isPartTime() ? "Yes" : "No"));
        System.out.println("Salary: $" + tester.determineSalary());

        scanner.close();
    }
}
