package task2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable{
	public void eatPizza() { System.out.println("Student is eating pizza and studying"); }
	public void retakeExam() { System.out.println("Student is retaking exam"); }
	public void move() { System.out.println("Student is moving to next class"); }
	public void dance() { System.out.println("Student is dancing at the party"); }
}
