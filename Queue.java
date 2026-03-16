import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {

        // 1️⃣ Creating Queue
        Queue<String> queue = new LinkedList<>();

        // 2️⃣ Adding elements
        queue.add("A");   // add() → ajoute un élément à la fin de la queue
        queue.add("B");
        queue.add("C");

        System.out.println("Queue after adding elements: " + queue);

        // offer() → ajoute aussi un élément (méthode alternative plus sûre)
        queue.offer("D");
        System.out.println("After offer(): " + queue);

        // peek() → regarde le premier élément sans le supprimer
        System.out.println("First element (peek): " + queue.peek());

        // 3️⃣ Removing element (FIFO)
        String removed = queue.remove(); // remove() → supprime le premier élément
        System.out.println("Removed element: " + removed);

        System.out.println("Queue after removal: " + queue);

        // poll() → supprime et retourne le premier élément (plus sûr que remove)
        System.out.println("Poll element: " + queue.poll());

        System.out.println("Queue after poll: " + queue);

        // size() → retourne le nombre d’éléments
        System.out.println("Queue size: " + queue.size());

        // contains() → vérifie si un élément existe
        System.out.println("Contains B? " + queue.contains("B"));

        // 4️⃣ Running through (Iterating)
        System.out.println("Iterating through queue:");
        for (String element : queue) {
            System.out.println(element);
        }

        // clear() → supprime tous les éléments
        // queue.clear();
        // System.out.println("Queue after clear: " + queue);
    }
}


First In First Out
