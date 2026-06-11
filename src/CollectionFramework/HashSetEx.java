package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashSetEx {

    public static void main(String[] args) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        // Adding elements
        hmap.put(101, "sam");
        hmap.put(45, "jhon");
        hmap.put(1, "sujit");
        hmap.put(3, "null");

        System.out.println("Original HashMap:");
        System.out.println(hmap);

        // Update value for key 101
        hmap.put(101, "arjit");

        System.out.println("\nAfter Updating:");
        System.out.println(hmap);

        // Check if key exists
        if (hmap.containsKey(45)) {
            System.out.println("\nData is available");
        } else {
            System.out.println("\nKey not found");
        }

        // Traverse HashMap
        System.out.println("\nDisplaying all key-value pairs:");

        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println(
                "Key = " + entry.getKey() +
                " , Value = " + entry.getValue()
            );
        }
    }
}