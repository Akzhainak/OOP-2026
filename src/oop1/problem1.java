package oop1;

	
	import java.util.Scanner;
	
	public class problem1{
		
		
		
		public static void main(String [] args) {
			
			Scanner in= new Scanner (System.in);
			
			System.out.println("name: ");
			String name =in.nextLine();
			
			String st="";
			for(int i=0;i<name.length();i++) {
					st+="-";
			}
			
			
			System.out.println("+" + st + "+");
			System.out.println("|" + name + "|");
			System.out.println("+" + st + "+");
			
			
			
			
		}
	}
