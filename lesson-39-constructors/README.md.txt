Lesson 39 - Constructors

This lesson introduces constructors, a special type of method used to initialize objects when they are created.
Constructors set the initial state of an object by assigning values to its attributes.

*Class Structure*
Constructors.java           → Main class (creates objects and tests behavior)
ConstructorsStudents.java   → Subclass (defines attributes, constructor, and methods)

*Key Concepts Demonstrated*

- Constructor Definition:
A constructor has the same name as the class and no return type.
It is called automatically when an object is created.

- Parameterized Constructor:
The ConstructorsStudents class defines a constructor that takes four parameters:

	String name
	int age
	double gpa
	boolean isEnrolled

These parameters allow setting initial values for each object upon creation.

- The this Keyword:
Used to refer to the current instance of the class, allowing us to distinguish between instance variables and constructor parameters with the same names.

- Object Initialization:
Three ConstructorsStudents objects are created with distinct data:

	student1 → “Spongebob”, 30, 3.2
	student2 → “Patrick”, 34, 1.5
	student3 → “Sandy”, 27, 4.0

- Method Call:
Each student object calls the study() method, which prints a custom message using the student’s name.

- Encapsulation of Data:
The attributes (name, age, gpa, isEnrolled) are grouped inside the class with related behavior.

*Notes*

Constructors automatically run when an object is instantiated.
The this keyword links constructor parameters to class fields.
OOP in Java supports organized, modular, and data-driven object creation.