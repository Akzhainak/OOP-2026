package task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Akzhainak", 4.0));
        students.add(new Student("Aruzhan", 3.8));
        students.add(new Student("Dias", 2.9));
        students.add(new Student("Alina", 3.5));

        System.out.println("original list:");
        printStudents(students);

        Collections.sort(students);
        System.out.println("\n sorted by GPA:");
        printStudents(students);

        Collections.sort(students, new NameComparator());
        System.out.println("\n sorted by name:");
        printStudents(students);
    }

    public static void printStudents(List<Student> students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
