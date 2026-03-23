package task2;

public class Main {
	public static void main(String[] args) {
		 Restaurant delpapa = new Restaurant();
	        
	     Cat myCat = new Cat();
	     Student myStudent = new Student();
	     System.out.println("cat");
	     delpapa.servePizza(myCat);

	     System.out.println("\n student ");
	     delpapa.servePizza(myStudent);
	}
       
}
