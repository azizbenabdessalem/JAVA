import java.util.*;

public class ListMain {

    public static void main(String[] args) {

        // Création de deux listes avec l'interface List
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        // add(index, element) → ajoute un élément à une position précise
        list1.add(0, 10);
        list1.add(1, 20);

        // Affichage de list1
        System.out.println("list1: " + list1);

        // add(element) → ajoute un élément à la fin de la liste
        list2.add(10);
        list2.add(20);
        list2.add(30);

        // Affichage de list2
        System.out.println("list2: " + list2);

        // addAll(index, collection) → ajoute tous les éléments d'une autre liste à une position donnée
        list1.addAll(1, list2);

        // remove(index) → supprime l'élément à l'indice donné
        list1.remove(1);

        // Affichage après suppression
        System.out.println("list1 after removing an element: " + list1);

        // get(index) → récupère l'élément situé à un indice
        System.out.println("list1 using get(): " + list1.get(2));

        // set(index, element) → remplace l'élément à l'indice donné
        list1.set(0, 50);

        // contains(element) → vérifie si un élément existe dans la liste
        System.out.println("Does list1 contain 20? " + list1.contains(20));

        // indexOf(element) → retourne l'indice de la première occurrence d'un élément
        System.out.println("Index of 20: " + list1.indexOf(20));

        // size() → retourne le nombre total d'éléments dans la liste
        System.out.println("Size of list1: " + list1.size());

        // Affichage final
        System.out.println("Final list1: " + list1);
    }
}




-----------------------------------------------------------------------------------------------------------

    import java.util.*;

public class SortExample {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        // Ajout d'éléments
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");

        System.out.println("Before Sorting : " + list);

        // sort() → trie la liste par ordre croissant (alphabetique ou numerique)
        Collections.sort(list);

        System.out.println("After Sorting (Ascending): " + list);

        // reverseOrder() → trie la liste par ordre décroissant
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("After Sorting (Descending): " + list);
    }
}
