import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Java");      // put() → ajoute une paire clé-valeur
        map.put(2, "Python");
        map.put(3, "C++");

        // Displaying HashMap
        System.out.println("HashMap: " + map);

        // Accessing value
        System.out.println("Value for key 2: " + map.get(2)); // get() → récupère la valeur associée à une clé

        // Updating value
        map.put(2, "Python Programming"); // put() avec clé existante → remplace la valeur
        System.out.println("After updating key 2: " + map);

        // Removing entry
        map.remove(1); // remove() → supprime une paire clé-valeur
        System.out.println("After removing key 1: " + map);

        // containsKey() → vérifie si une clé existe
        System.out.println("Contains key 3? " + map.containsKey(3));

        // containsValue() → vérifie si une valeur existe
        System.out.println("Contains value 'Java'? " + map.containsValue("Java"));

        // size() → retourne le nombre d’éléments dans la map
        System.out.println("Size of map: " + map.size());

        // keySet() → retourne toutes les clés
        System.out.println("Keys: " + map.keySet());

        // values() → retourne toutes les valeurs
        System.out.println("Values: " + map.values());

        // entrySet() → retourne les paires clé-valeur
        System.out.println("Entries: " + map.entrySet());

        // Iterating through the HashMap
        System.out.println("Iterating map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // clear() → supprime tous les éléments
        // map.clear();
        // System.out.println("After clearing map: " + map);
    }
}




structure qui stocke des données sous forme de paire : clé → valeur (key → value).
