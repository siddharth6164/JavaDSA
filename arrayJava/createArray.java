import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class createArray {
    public static void main(String[] args) throws NoSuchFieldException {

        int[] array = {1,2,3,4,5};
        System.out.println(array);  //[I@372f7a8d it is give the memory address
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        ArrayList<Integer> arrayList1 = new ArrayList<>();  // Create an ArrayList of Integers
        arrayList1.add(101); // Add 101 at index 0
        arrayList1.add(102); // Add 102 at index 1
        arrayList1.add(103); // Add 103 at index 2
        

         // Iterate over the ArrayList using a for loop
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        } 
        
         // Iterate over the ArrayList using an enhanced for loop
        for (int x : arrayList1) {
            System.out.println(x);
        }

        System.out.println(arrayList1);                           // Print the entire ArrayList
        System.out.println(arrayList1.get(2));              // Access and print a specific element by its index
        System.out.println(arrayList1.size());                    // Print the size (number of elements) of the ArrayList
        System.out.println(arrayList1.contains(104));           // Checks if 104 exists in the ArrayList (false)
        System.out.println(arrayList1.contains(103));           // Checks if 103 exists in the ArrayList (true)
        
        arrayList1.remove(2);                               // Removes the element at index 2 (103)
        arrayList1.remove(Integer.valueOf(102));                // Removes the first occurrence of the value 102
        System.out.println(arrayList1);
        arrayList1.add(1, 104);                     // Inserts 104 at index 1
        arrayList1.set(1,105);                      // Replaces the element at index 1 with 105
        System.out.println(arrayList1);
        
        
        ArrayList<Integer> arrayList2 = new ArrayList<>(11); //ArrayList<>(11) is prepared to hold 11 elements before needing to resize

        List<String> list = new ArrayList<>();                      // Create a new ArrayList of Strings and assign it to the variable 'list'.
        System.out.println(list.getClass().getName());              // The getClass().getName() method returns the fully qualified class name of the object.

        List<String> list1 = Arrays.asList("a", "b", "c", "d");    // Note: The resulting list is fixed-size, and attempting to modify it (e.g., add or remove elements) will throw an UnsupportedOperationException.
        System.out.println("Create the Arrays.asList, given the className-->"+list1.getClass().getName());                 // The getClass().getName() method returns the fully qualified class name of the object.
        // list1.add("e");     //we are not use add❌                  // Exception in thread "main" java.lang.UnsupportedOperationException
        list1.set(1,"f");   // only use set✅
        System.out.println("Print the Arrays.asList-->"+list1);  // [a, f, c, d]

        List<Integer> list2 = List.of(1,2,3,4,5);       // Create a List of Integer 
        System.out.println("Create Array with List--> "+list2);  // [1,2,3,4,5]
        System.out.println("access the element with given index value"+list2.get(1));   // not use the set method only get method are use 
        arrayList1.addAll(list2);           // In ArrayList add List
        System.out.println("Add the List.of in ArrayList--> "+arrayList1);
        Collections.sort(arrayList1);
        System.out.println("Sorting array--> "+arrayList1);
    }
} 