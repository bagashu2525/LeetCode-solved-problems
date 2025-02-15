import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValue {
    // Method to compare two Map entries by value
    public static int compareByValue(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
        return entry1.getValue().compareTo(entry2.getValue());
    }

    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 15);
        myMap.put("banana", 20);
        myMap.put("cherry", 15);

        // Convert to list of entries
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(myMap.entrySet());

        // Sort by values using a separate compare method
        Collections.sort(list, SortHashMapByValue::compareByValue);

        // Print sorted key-value pairs
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
