package exercise1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize account with a balance
        System.out.print("Enter initial account balance: ");
        double initialBalance = scanner.nextDouble();
        Account account = new Account(initialBalance);

        // Create a list to hold transaction threads
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Input transactions
        System.out.print("Enter the number of transactions: ");
        int numberOfTransactions = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < numberOfTransactions; i++) {
            System.out.printf("Enter details for Transaction %d (format: type amount): ", i + 1);
            String[] input = scanner.nextLine().split(" ");
            String type = input[0];
            double amount = Double.parseDouble(input[1]);

            // Create and add transaction to the list
            transactions.add(new Transaction(account, type, amount));
        }

        // Execute transactions concurrently
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (Transaction transaction : transactions) {
            executorService.execute(transaction);
        }

        executorService.shutdown();

        scanner.close();
    }
}
