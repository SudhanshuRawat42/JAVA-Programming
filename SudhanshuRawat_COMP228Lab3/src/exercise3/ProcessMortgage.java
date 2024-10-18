package exercise3;

import java.util.Scanner;

import static exercise3.MortgageConstants.MAX_AMOUNT;

public class ProcessMortgage {
    public static void main(String[] args) {
        Mortgage[] mortgages = new Mortgage[3]; // Array to store 3 mortgages
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current prime interest rate: ");
        double primeRate = scanner.nextDouble();

        for (int i = 0; i < mortgages.length; i++) {
            System.out.println("Mortgage #" + (i + 1));

            System.out.print("Enter mortgage type (1 for Business, 2 for Personal): ");
            int type = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter mortgage number: ");
            String mortgageNumber = scanner.nextLine();

            System.out.print("Enter customer name: ");
            String customerName = scanner.nextLine();

            double amount = 0;
            while (true) {
                System.out.print("Enter mortgage amount: ");
                amount = scanner.nextDouble();

                if (amount > MAX_AMOUNT) {
                    System.out.println("Mortgage amount exceeds $300,000.");
                    System.out.print("Do you want to re-enter the amount? (y/n): ");
                    char response = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline

                    if (response == 'y' || response == 'Y') {
                        continue;
                    } else {
                        System.out.println("Skipping this mortgage entry.");
                        break;
                    }
                } else {
                    break;
                }
            }

            if (amount <= MAX_AMOUNT) {
                System.out.print("Enter term (1, 3, or 5 years): ");
                int term = scanner.nextInt();

                if (type == 1) {
                    mortgages[i] = new BusinessMortgage(mortgageNumber, customerName, amount, primeRate, term);
                } else if (type == 2) {
                    mortgages[i] = new PersonalMortgage(mortgageNumber, customerName, amount, primeRate, term);
                } else {
                    System.out.println("Invalid mortgage type. Skipping...");
                    i--;
                }
            }
        }

        System.out.println("\nMortgage Details:");
        for (Mortgage mortgage : mortgages) {
            if (mortgage != null) {
                mortgage.getMortgageInfo();
                System.out.println("----------------------------");
            }
        }

        scanner.close();
    }
}

