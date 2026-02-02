package week2;
import java.util.Scanner;

public class Student {
	
	
	
	private String name;
	private int id;
	private int Syear;
	
	public Student(String name, int id, int Syear ) {
		this.name= name;
		this.id= id;
		this.Syear = Syear;
	}
	public String getName (){return name;}
	public int getID (){ return id;}
	public int getYear() {return Syear;}
	
	
	
	
	public void IncrYear() {
		Syear=Syear+1;
	}
	
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Year of study: " + Syear);
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name=in.nextLine();
		
		System.out.print("Enter id: ");
	    int id=in.nextInt();
	    
	    System.out.print("Enter year: ");
		int Syear=in.nextInt();
		
		
		Student s = new Student(name, id, Syear);
		
		s.IncrYear();
		s.print();
	}
	
}
