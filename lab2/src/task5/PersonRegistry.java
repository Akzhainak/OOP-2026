package task5;

import java.util.ArrayList;
import java.util.List;

class PersonRegistry {
    private List<Person> people;

    public PersonRegistry() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
        System.out.println(person.getName() + " added to registry.");
    }

    public void removePerson(Person person) {
        if (people.remove(person)) {
            System.out.println(person.getName() + " removed from registry.");
        } else {
            System.out.println(person.getName() + " not found in registry.");
        }
    }

    public List<Person> getPeopleWithPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.hasPet()) result.add(p);
        }
        return result;
    }

    public List<Person> getPeopleWithoutPets() {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (!p.hasPet()) result.add(p);
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Person p : people) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}