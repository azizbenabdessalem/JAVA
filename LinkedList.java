import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Adding element at specific position
        list.add(1, "DSA");

        System.out.println("Initial LinkedList: " + list);

        // Accessing element
        System.out.println("Element at index 2: " + list.get(2));

        // Removing element
        list.remove("Python");
        System.out.println("After removing Python: " + list);

        // Updating element
        list.set(0, "Java Programming");
        System.out.println("After updating first element: " + list);

        // contains() → vérifie si un élément existe dans la liste
        System.out.println("Contains C++ ? " + list.contains("C++"));

        // indexOf() → retourne l'indice de la première occurrence
        System.out.println("Index of C++: " + list.indexOf("C++"));

        // size() → retourne le nombre total d'éléments
        System.out.println("Size of list: " + list.size());

        // isEmpty() → vérifie si la liste est vide
        System.out.println("Is list empty? " + list.isEmpty());

        // Iterating using for-each loop
        System.out.println("Iterating elements:");
        for (String s : list) {
            System.out.println(s);
        }

        // clear() → supprime tous les éléments de la liste
        list.clear();
        System.out.println("After clearing list: " + list);
    }
}
