package task1_c;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
    public static void main(String[] args) {
        Flower f1 = new Flower("Rose", "Red");
        Flower f2 = new Flower("Rose", "Red"); 
        Flower f3 = new Flower("Daisy", "Yellow");

        Set<Flower> flowerSet = new HashSet<>();
        flowerSet.add(f1);
        flowerSet.add(f2); 
        flowerSet.add(f3);

        System.out.println("Flower equals test: " + f1.equals(f2)); 
        System.out.println("Flower set size: " + flowerSet.size()); 
        System.out.println(flowerSet);

       
        Tulip t1 = new Tulip("Tulip", "Pink", "Parrot");
        Tulip t2 = new Tulip("Tulip", "Pink", "Parrot"); 
        Tulip t3 = new Tulip("Tulip", "Purple", "Darwin");

        Set<Tulip> tulipSet = new HashSet<>();
        tulipSet.add(t1);
        tulipSet.add(t2);
        tulipSet.add(t3);

        System.out.println("\nTulip equals test: " + t1.equals(t2)); 
        System.out.println("Tulip set size: " + tulipSet.size()); 
        System.out.println(tulipSet);
    }
}
