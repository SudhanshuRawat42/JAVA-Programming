package exercise3;

abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName, double amount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;
        this.amount = amount;
        this.interestRate = interestRate;

        if (term != SHORT_TERM && term != MEDIUM_TERM && term != LONG_TERM) {
            System.out.println("Invalid term. Setting it to the default short-term (1 year).");
            this.term = SHORT_TERM;
        } else {
            this.term = term;
        }
    }

    public abstract void getMortgageInfo();

    public double computeTotalOwed() {
        return amount + ((amount * interestRate * term)/100);
    }
}

