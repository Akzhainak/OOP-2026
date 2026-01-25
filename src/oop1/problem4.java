package oop1;
import java.util.Scanner;

public class problem4 {

	public static void main(String [] args) {
		Scanner in=new Scanner (System.in);
		
		System.out.println("a: ");
		int a=in.nextInt();
		
		System.out.println("b: ");
		int b=in.nextInt();
		
		System.out.println("c: ");
		int c=in.nextInt();
		
		int D=b*b - 4*a*c;
		
		if (D<0) {
			System.out.println("error");
		}
		else System.out.println(D);
	}
	
}

//D = b^2 - 4ac