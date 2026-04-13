package task5;

abstract class Person {
	private String name;
	private int age;
	private Animal pet; 

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.pet = null;
 }

	public String getName() { 
		return name; 
	}
	public int getAge() { 
		return age; 
	}
	public Animal getPet() { 
		return pet; 
	}

	public void assignPet(Animal pet) {
		this.pet = pet;
	}

	public void removePet() {
     this.pet = null;
	}

	public boolean hasPet() {
     return pet != null;
	}
	
 
	public abstract String getOccupation();

	public void leavePetWith(Person caretaker) {
		if (!hasPet()) {
			System.out.println(name + " doesn't have a pet to leave!");
			return;
     }
    
		try {
			Animal myPet = this.pet;
			caretaker.assignPet(myPet); 
			this.removePet();
			System.out.println(name + " left " + myPet.getName() + " with " + caretaker.getName());
		} catch (IllegalArgumentException e) {
			System.out.println("Cannot leave pet with " + caretaker.getName() + ": " + e.getMessage());
		}
	}

 
	public void retrievePetFrom(Person caretaker) {
		if (!caretaker.hasPet()) {
			System.out.println(caretaker.getName() + " doesn't have a pet to return!");
			return;
     }
		Animal theirPet = caretaker.getPet();
		caretaker.removePet();
		this.assignPet(theirPet);
		System.out.println(name + " retrieved " + theirPet.getName() + " from " + caretaker.getName());
 }

	@Override
 	public String toString() {
		String petInfo = hasPet() ? ", pet: [" + pet + "]" : ", no pet";
		return getClass().getSimpleName() + " " + name +
            " (age: " + age + ", occupation: " + getOccupation() + petInfo + ")";
 }

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Person person = (Person) obj;
		return age == person.age && name.equals(person.name);
 }

	@Override
	public int hashCode() {
		return java.util.Objects.hash(name, age);
 }
}
