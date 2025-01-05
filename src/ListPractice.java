import java.util.ArrayList;
import java.util.Collections;
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> namesList = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    namesList.add("Bahram");
    namesList.add("Ibrahim");
    namesList.add("Kamran");
    namesList.add("Asif");
    System.out.println(namesList);
    // Print the element at index 1
    System.out.println(namesList.get(1));
    

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    namesList.set(1, "Abdul");
    System.out.println(namesList);

    // Insert a new element at index 0 (the length of the list will change)
    namesList.add("Ikram");
    System.out.println(namesList);

    // Check whether the list contains a certain string
    String searchName = "Bahra";
    if(namesList.contains(searchName)){
      System.out.println("The nameList have " + searchName );
    }else{
      System.out.println(searchName + " is not on the List");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for(int i = 0; i < namesList.size(); i++){
      System.out.println("Index " + i + ": " + namesList.get(i)); 
    }

    // Sort the list using the Collections library
    Collections.sort(namesList);
    System.out.println("After the list is sorted " + namesList);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for(String newNamesList: namesList){
      System.out.println();
      System.out.println(newNamesList);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}