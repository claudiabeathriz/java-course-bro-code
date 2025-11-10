Lesson 30 - Arrays

This lesson introduces arrays in Java — a fundamental data structure used to store multiple values of the same data type in a single variable. Arrays make it easier to organize and process collections of related data efficiently.

*Topics Covered*

- Declaring and initializing arrays
- Accessing and modifying array elements
- Using a for loop and an enhanced for loop (for-each)
- Getting the array’s length
- Using utility methods from the Arrays class (sort, fill)
- Understanding index-based access (starting from 0)

*Program Logic*

The program declares an array of strings named fruits containing multiple fruit names.

It prints each element twice:

First, using a traditional for loop, accessing elements by their index.

Then, using an enhanced for loop, which automatically iterates through all elements.

The code includes examples (commented out) showing how to:

- Change an element in the array
- Retrieve the total number of elements
- Sort the array alphabetically
- Fill the array with a single repeated value

*Code Example*

import java.util.Arrays;

public class ArraysInJava {
    public static void main(String[] args) {

        // array = a collection of values of the same data type
        // think of it as a variable that can store more than 1 value

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // Standard for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        // Enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Modify an element
        // fruits[0] = "pineapple";

        // Get array length
        // int numOfFruits = fruits.length;

        // Sort array alphabetically
        // Arrays.sort(fruits);

        // Fill array with one value
        // Arrays.fill(fruits, "pineapple");
    }
}


Sample Output

apple
orange
banana
coconut
apple
orange
banana
coconut

*Notes*

Array indices start at 0, meaning the first element is array[0].
The .length property returns the total number of elements.
The Arrays class (from java.util) provides useful static methods to manipulate arrays.
Arrays store a fixed number of elements — once created, their size cannot change.
