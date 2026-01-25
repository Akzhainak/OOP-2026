package oop1;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] d) {
		Scanner in=new Scanner (System.in);
		
		System.out.println("enter string: ");
		String w=in.nextLine();
		String w2="";
		for(int i=w.length()-1;i>=0;i--) {
			w2+=w.charAt(i);
		}
		if (w.equals(w2)) {
			System.out.println("Palindrome");
		}
		else System.out.println("not Palindrome");
	}
}
