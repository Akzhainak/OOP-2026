package task5;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        Person bob = new Student("Bob", 20, "Biology");

        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);
        Animal tweety = new Bird("Tweety", 2);

        john.assignPet(murka);
        bob.assignPet(rex);
        alice.assignPet(tweety);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        registry.addPerson(bob);

        System.out.println(registry);

        john.leavePetWith(alice);
        System.out.println(registry);

        john.retrievePetFrom(alice);
        System.out.println(registry);

        bob.leavePetWith(alice); 
    }
}