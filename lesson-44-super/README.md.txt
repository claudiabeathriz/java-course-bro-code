Lesson 44 - Super keyword

This lesson introduces the super keyword, which allows a subclass to access parent class (superclass) methods and constructors.
It is commonly used in constructor chaining and method overriding to refer to the parent class.

*Class Structure*
Super.java          → Main class (creates objects and calls methods)
SuperPerson.java    → Parent class (defines basic person attributes)
SuperStudent.java   → Subclass of Person (adds GPA)
SuperEmployee.java  → Subclass of Person (adds salary)

*Key Concepts Demonstrated*

- super in Constructors:
	Allows subclasses to call the parent class constructor to initialize inherited attributes.
	Example: super(firstName, lastName); in Student or Employee.

- Inheritance:
	Student and Employee inherit from Person, gaining access to its attributes and methods.
	This avoids code duplication and centralizes common behavior.

- Accessing Parent Methods:
	Subclasses can use super to call a method from the parent class if it has been overridden.

- Subclass-Specific Attributes:
	Student adds gpa
	Employee adds salary
	Each subclass extends the behavior of the parent while keeping its own unique properties.

- Object Instantiation:
	Three objects are created to demonstrate how super works in practice:
		person → base Person object
		student → Student object with GPA
		employee → Employee object with salary