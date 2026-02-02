package oop1;
import java.util.Scanner;

public class problem5 {
	public static void main(String []a) {
		Scanner in=new Scanner (System.in);
		int balance = 20;
		
		System.out.println("your current balance is: " + balance +"$");
		System.out.println("enter money to add: " );
		int money=in.nextInt();
		
		System.out.println("your updated blance is: "+ (balance+money)+"$");
	}
}
