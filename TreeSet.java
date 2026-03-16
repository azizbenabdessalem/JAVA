import java.util.*;

public class TreeSetDemo {

    public static void main(String[] args) {

        // 1️⃣ Creating TreeSet
        TreeSet<Integer> set = new TreeSet<>();

        // 2️⃣ Adding elements
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(30); // Duplicate (will not be added)

        System.out.println("After adding elements: " + set);

        // 3️⃣ Removing element
        set.remove(20);

        System.out.println("After removing 20: " + set);

        // 4️⃣ Running through (Iterating)
        System.out.println("Iterating elements:");

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}



Il n'ya pas de doublons et les c'est trié dans l'ordre croissant
