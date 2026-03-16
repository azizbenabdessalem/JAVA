import java.util.*;

public class ListMain {

    public static void main(String[] args) {

        // Creating two lists using List interface
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        // Adding elements to list1
        list1.add(0, 10);
        list1.add(1, 20);

        // Printing list1
        System.out.println("list1: " + list1);

        // Adding elements to list2
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // Printing list2
        System.out.println("list2: " + list2);

        // Adding all elements of list2 into list1 at index 1
        list1.addAll(1, list2);

        // Removing element at index 1
        list1.remove(1);

        // Printing list1 after removing
        System.out.println("list1 after removing an element: " + list1);

        // Using get() method
        System.out.println("list1 using get(): " + list1.get(2));

        // Replacing element at index 0
        list1.set(0, 50);


        // Printing final list1
        System.out.println("list1: " + list1);
    }
}


        ---------------------------------------------------------------------------

            List <String> list = new ArrayList<String>() ;

        list.add("Banana") ;
        list.add("Apple");
        list.add("Mango");

System.out.println("Before Sorting : " +list ) ;
Collections.sort(list) ;   ------> Pour trier nombres ou chiffres 
Collections.sort(list, Collections.reverseOrder() ) ; ----> Trier dans l'ordre décroissant 
System.out.println("After Sorting : " + list) ;
        
        
