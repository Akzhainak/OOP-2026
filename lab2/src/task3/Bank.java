package task3;

import java.util.Vector;

public class Bank {

	private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account a) {
        accounts.add(a);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(a -> a.getAccountNumber() == accNumber);
    }

    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) ((SavingsAccount) a).addInterest();
            else if (a instanceof CheckingAccount) ((CheckingAccount) a).deductFee();
        }
    }
    

    public void printAll() {
        for (Account a : accounts) a.print();
    }
    

    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount sav = new SavingsAccount(2001, 5.0);
        sav.deposit(1000);

        CheckingAccount chk = new CheckingAccount(3001);
        chk.deposit(300);
        chk.withdraw(50);
        chk.deposit(20);
        chk.withdraw(10);
        chk.deposit(15);

        bank.openAccount(new Account(1001));
        bank.openAccount(sav);
        bank.openAccount(chk);

        bank.printAll();
        bank.update();
        System.out.println("after update:");
        bank.printAll();
    }

}
