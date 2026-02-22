package problem1;

class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
    }

    void makeSound() {
        super.makeSound(); 
        System.out.println("The " + breed + " named " + name + " barks: Woof!");
    }

    void eat() {
        System.out.println("The " + breed + " is eating.");
    }

    void eat(String food) {
        System.out.println("The " + breed + " is eating " + food + ".");
    }
}