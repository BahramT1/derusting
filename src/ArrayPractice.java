import java.util.Arrays;
public class ArrayPractice {
  public static void main(String[] args) {
     // Create an array of Strings of size 4
   String[] arr = {"bahram", "Ibrahim", "Kamran", "Asif"};
      System.out.println("First Array " + Arrays.toString(arr));

    // Set the value of the array at each index to be a different String
   // It's OK to do this one-by-one
   String[] newArray = new String[4];
    
    newArray[0] = "Ibrahim";
    newArray[1] = "Bahram";
    newArray[2] = "Kamran";
    newArray[3] = "Asif";
    System.out.println("Second Array" + Arrays.toString(newArray));
    // Get the value of the array at index 2
    System.out.println("Second Value " + newArray[1]);

    // Get the length of the array
    System.out.println("Length of Array " + newArray.length);

    // Iterate over the array using a traditional for loop and print out each item
    System.out.println("After for Loop " );
    for(int i = 0; i < 4 ; i++){
      System.out.println(newArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    System.out.println("After for each Loop ");
    for(String names: newArray){
      System.out.println(names);
    }



    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
