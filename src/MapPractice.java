import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values
    Map<String, Integer> map = new HashMap<>();

    // Add 3 key/value pairs to the Map
    map.put("Alice", 25);
    map.put("Bob", 30);
    map.put("Charlie", 35);

    // Get the value for the key "Alice"
    System.out.println("Alice's age: " + map.get("Alice"));

    // Find the size of the Map
    System.out.println("Number of entries in the Map: " + map.size());

    // Replace Bob's age
    map.put("Bob", 40);
    System.out.println("Bob's new age: " + map.get("Bob"));

    // Check if the Map contains the key "Charlie"
    System.out.println("Map contains Charlie: " + map.containsKey("Charlie"));

    // Check if the Map contains the value 40
    System.out.println("Map contains age 40: " + map.containsValue(40));

    // Print all keys
    System.out.println("Keys in the Map:");
    for (String key : map.keySet()) {
      System.out.println(key);
    }

    // Print all values
    System.out.println("Values in the Map:");
    for (Integer value : map.values()) {
      System.out.println(value);
    }

    // Print all key/value pairs
    System.out.println("Entries in the Map:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
   /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}