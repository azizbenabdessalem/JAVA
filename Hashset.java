import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        int count[] = {34, 22, 10, 60, 30, 22};

        // Creating HashSet
        Set<Integer> set = new HashSet<>();

        try {

            // Adding first 5 elements into the set
            for (int i = 0; i < 5; i++) {
                set.add(count[i]);   // add() → ajoute un élément dans le HashSet
            }

            // Printing the set
            System.out.println("Elements in HashSet: " + set);

            // contains() → vérifie si un élément existe dans le HashSet
            System.out.println("Contains 22 ? " + set.contains(22));

            // size() → retourne le nombre d'éléments dans le HashSet
            System.out.println("Size of set: " + set.size());

            // remove() → supprime un élément du HashSet
            set.remove(10);
            System.out.println("After removing 10: " + set);

            // isEmpty() → vérifie si le HashSet est vide
            System.out.println("Is set empty? " + set.isEmpty());

            // clear() → supprime tous les éléments du HashSet
            // set.clear();
            // System.out.println("After clear: " + set);

        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }
}



Un HashSet en Java est une collection qui stocke des éléments uniques (sans doublons) et sans ordre.
