package exercise3;

class BusinessMortgage extends Mortgage {
    public BusinessMortgage(String mortgageNumber, String customerName, double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, primeRate + 1, term);
    }

    @Override
    public void getMortgageInfo() {
        System.out.println("Business Mortgage");
        System.out.println("Mortgage Number: " + mortgageNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Term: " + term + " years");
        System.out.println("Total Owed: " + computeTotalOwed());
    }
}


