package CollectionJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        List list = new ArrayList<>();
        // add()  :add the element 
        // set()  :set(x,"msg")set method change the element at index x. 
        // size() :Returns the length of the arraylist.
        // sort() :Sort the arraylist elements.
        // clone() :Creates a new arraylist with the same element, size, and capacity.
        // contains() :Searches the arraylist for the specified element and returns a boolean result.
        // ensureCapacity() :Specifies the total element the arraylist can contain.
        // isEmpty() :Checks if the arraylist is empty.
        // indexOf() :Searches a specified element in an arraylist and returns the index of the element.
        
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        System.out.println(array);
        // System.out.println(array.size());
        // System.out.println(array.contains(7));
        // System.out.println(array.isEmpty());
        // array.set(1,5);
        // System.out.println(array);
        // System.out.println(array.indexOf(5));
        // Reverse method inside using Comparator
        array.sort((a,b)->b-a);
        System.out.println(array);
    }
}
