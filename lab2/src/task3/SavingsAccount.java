package task3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    public void addInterest() {
        deposit(getBalance() * interestRate / 100);
    }

    public String toString() {
        return "Savings " + super.toString() + " rate: " + interestRate + "%";
    }
}