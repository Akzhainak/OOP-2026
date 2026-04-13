package task5;


abstract class Animal {
	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
 }

 	public String getName() { 
 		return name; 
 	}
 	public int getAge() { 
 		return age; 
 	}
 	
 	public abstract String getSound();

 	@Override
 	public String toString() {
 		return getClass().getSimpleName() + " " + name + " (age: " + age + "), says: " + getSound();
 }

 	@Override
 	public boolean equals(Object obj) {
 		if (this == obj) return true;
 		if (obj == null || getClass() != obj.getClass()) return false;
     Animal animal = (Animal) obj;
     return age == animal.age && name.equals(animal.name);
 }

 	@Override
 	public int hashCode() {
 		return java.util.Objects.hash(name, age);
 	}
}







