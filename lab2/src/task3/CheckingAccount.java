package task3;

public class CheckingAccount extends Account  {
	 private int transactions;
	    private static final int FREE_TRANSACTIONS = 3;

	    public CheckingAccount(int a) {
	        super(a);
	        transactions = 0;
	    }
	    @Override
	    public void deposit(double sum) {
	        super.deposit(sum);
	        transactions++;
	    }
	    public void withdraw(double sum) {
	        super.withdraw(sum);
	        transactions++;
	    }

	    public void deductFee() {
	        if (transactions > FREE_TRANSACTIONS)
	            super.withdraw((transactions - FREE_TRANSACTIONS) * 0.02);
	        transactions = 0;
	    }

	    public String toString() {
	        return "Checking " + super.toString() + " transactions: " + transactions;
}
}
