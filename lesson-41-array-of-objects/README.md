Lesson 41 – Array of Objects

This lesson introduces arrays of objects, demonstrating how multiple instances of a class can be stored, accessed, and manipulated using arrays.
It also explores anonymous objects and the use of both traditional for loops and enhanced for-each loops to iterate over object collections.

*Class Structure*

ArrayOfObjects.java → Main class (creates and iterates over an array of car objects)
ArrayOfObjectsCar.java → Object class (defines car attributes and behavior)

*Key Concepts Demonstrated*

- Array of Objects
Instead of storing primitive values, an array can store references to objects.
Each position in the array points to an instance of the ArrayOfObjectsCar class.

- Object Instantiation in Arrays
The lesson shows different ways to create and store objects in an array (commented alternatives included), with emphasis on:

- Creating objects individually and assigning them to an array

- Using anonymous objects, where objects are instantiated directly inside the array without being stored in separate variables

Example:

ArrayOfObjectsCar[] cars = {
new ArrayOfObjectsCar("Mustang", "red"),
new ArrayOfObjectsCar("Corvette", "blue"),
new ArrayOfObjectsCar("Charger", "yellow")
};

- Constructor Usage
Each ArrayOfObjectsCar object is initialized through a constructor that assigns values to:

model
color

The this keyword is used to distinguish between instance variables and constructor parameters.

- Iterating with a Traditional for Loop
A classic for loop is used to:

Access objects by index
Call the drive() method on each object in the array

This demonstrates direct control over array indices.

- Enhanced for-each Loop
The enhanced for loop is used to:

Modify object attributes (color)
Call methods in a cleaner and more readable way

This highlights how for-each loops simplify iteration when index access is not required.

- Object Mutability Inside Arrays
Changing an attribute (such as color) inside a loop affects the actual object stored in the array, not a copy.

- This demonstrates that arrays store references, not duplicated objects.

- Behavior Encapsulation
The drive() method encapsulates behavior inside the object, allowing the main class to interact with objects through method calls rather than direct logic.