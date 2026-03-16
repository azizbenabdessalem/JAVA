import java.util.*;

public class Test {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // doublon

        System.out.println(set);
    }
}

Cest un hashset, avec un ordre et sans doublons
