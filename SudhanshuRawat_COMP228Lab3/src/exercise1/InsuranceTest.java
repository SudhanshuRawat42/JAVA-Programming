package exercise1;

import java.util.Scanner;

public class InsuranceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Insurance[] insuranceArray = new Insurance[2];

        for (int i = 0; i < insuranceArray.length; i++) {
            System.out.print("Enter the type of insurance (Life/Health): ");
            String insuranceType = scanner.nextLine();

            if (insuranceType.equalsIgnoreCase("Life")) {
                insuranceArray[i] = new Life();
            } else if (insuranceType.equalsIgnoreCase("Health")) {
                insuranceArray[i] = new Health();
            } else {
                System.out.println("Invalid insurance type. Please try again.");
                i--;
                continue;
            }

            System.out.print("Enter the monthly cost: ");
            double monthlyCost = scanner.nextDouble();
            scanner.nextLine();

            insuranceArray[i].setInsuranceCost(monthlyCost);
        }

        System.out.println("\nInsurance Information:");
        for (Insurance insurance : insuranceArray) {
            insurance.displayInfo();
            System.out.println("----------------------------");
        }

        scanner.close();
    }
}

