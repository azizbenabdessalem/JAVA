import java.util.Map;
import java.util.TreeMap;

public class CollectionsDemo {

    public static void main(String[] args) {

        // Creating TreeMap
        Map<String, String> m1 = new TreeMap<>();

        // Adding key-value pairs
        m1.put("Zara", "8");      // put() → ajoute une paire clé-valeur
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        // Printing empty line
        System.out.println();

        // Printing map
        System.out.println("Map Elements:");
        System.out.println(m1);

        // containsKey() → vérifie si une clé existe
        System.out.println("Contains key 'Ayan'? " + m1.containsKey("Ayan"));

        // containsValue() → vérifie si une valeur existe
        System.out.println("Contains value '14'? " + m1.containsValue("14"));

        // size() → retourne le nombre d’éléments dans la map
        System.out.println("Size of map: " + m1.size());

        // firstKey() → retourne la première clé (plus petite alphabétiquement)
        System.out.println("First key: " + ((TreeMap<String,String>) m1).firstKey());

        // lastKey() → retourne la dernière clé
        System.out.println("Last key: " + ((TreeMap<String,String>) m1).lastKey());

        // Removing entry
        m1.remove("Zara");   // remove() → supprime une paire clé-valeur
        System.out.println("After removing Zara: " + m1);

        // Iterating through TreeMap
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<String, String> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // keySet() → retourne toutes les clés
        System.out.println("\nKeys: " + m1.keySet());

        // values() → retourne toutes les valeurs
        System.out.println("Values: " + m1.values());

        // clear() → supprime tous les éléments
        // m1.clear();
        // System.out.println("After clear: " + m1);
    }
}


Donc c’est comme un HashMap (clé → valeur) mais les clés sont toujours triées.
