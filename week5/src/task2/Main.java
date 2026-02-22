package task2;
import java.util.Vector;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Vector<Person> users = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Person");
            System.out.println("2. Add Student");
            System.out.println("3. Add Staff");
            System.out.println("4. Print All Users");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 5) break;

            if (choice == 4) {
                System.out.println("\nAll Added Users:");
                for (Person p : users) {
                    System.out.println(p.toString());
                }
                continue;
            }

            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            switch (choice) {
                case 1:
                    users.add(new Person(name, address));
                    break;
                case 2:
                    System.out.print("Enter program: ");
                    String program = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter fee: ");
                    double fee = scanner.nextDouble();
                    users.add(new Student(name, address, program, year, fee));
                    break;
                case 3:
                    System.out.print("Enter school: ");
                    String school = scanner.nextLine();
                    System.out.print("Enter pay: ");
                    double pay = scanner.nextDouble();
                    users.add(new Staff(name, address, school, pay));
                    break;
            }
            System.out.println("Successfully added!");
        }
        scanner.close();
    }
}
