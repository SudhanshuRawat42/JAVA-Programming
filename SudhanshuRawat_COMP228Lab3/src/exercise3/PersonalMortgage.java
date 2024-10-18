package exercise3;

import java.util.Scanner;

class PersonalMortgage extends Mortgage {
    public PersonalMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 2, term);
    }

    @Override
    public void getMortgageInfo() {
        System.out.println("Personal Mortgage");
        System.out.println("Mortgage Number: " + mortgageNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Term: " + term + " years");
        System.out.println("Total Owed: " + computeTotalOwed());
    }
}



