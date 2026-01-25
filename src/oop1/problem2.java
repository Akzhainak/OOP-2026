package oop1;

	import java.util.Scanner;
	import java.lang.Math;
	
	public class problem2{
		public static void main (String [] args) {
			Scanner in=new Scanner(System.in);
			int n;
			
			System.out.println("Side of square: ");
			n=in.nextInt();
			
			System.out.println("area: "+(n*n));
			
			System.out.println("perimeter: "+(n*4));
			
			System.out.println("diagonal: " + (n*Math.sqrt(n)));
		}
	}
