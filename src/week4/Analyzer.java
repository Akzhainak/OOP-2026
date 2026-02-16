package week4;
import java.util.Scanner;



public class Analyzer{
	public static void main(String [] args) {
		Scanner scanner= new Scanner(System.in);
		Data data= new Data();
		
		while(true) {
			System.out.println("Enter number (Q to quit): ");
			String input = scanner.next();
			
			if (input.equalsIgnoreCase("Q")) break;
			
			try {
				double x= Double.parseDouble(input);
				data.add(x);
			} catch (NumberFormatException ex){
				System.out.println("invalid input");
			}
		}
		
		System.out.println("Average = " + data.getAverage());
		System.out.println("max = "+ data.getMax());
		
		
		
	}
	
	
}
