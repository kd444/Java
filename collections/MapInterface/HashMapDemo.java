package collections.MapInterface;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // create a new HashMap that maps integers to integers
        HashMap<Integer, Integer> table = new HashMap<>();

        // populate the table with the multiplication table for 4
        for (int i = 1; i <= 10; i++) {
            table.put(i, i * 4);
        }

        // print the table
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 4 = " + table.get(i));
        }
    }
}
