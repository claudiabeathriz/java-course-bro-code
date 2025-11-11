Lesson 38 - Object-Oriented Programming (OOP)

This lesson introduces the fundamentals of Object-Oriented Programming (OOP) using a simple example: a Car object.
OOP allows developers to model real-world entities by grouping attributes (data) and methods (behavior) within classes.

*Class Structure*

ObjectOrientedProgramming.java   → Main class (creates and interacts with the object)
OOPCar.java                      → Subclass defining the Car blueprint

*Key Concepts Demonstrated*

- Class Definition:
OOPCar acts as a blueprint that defines what a car is and what it can do.

- Object Creation:
The ObjectOrientedProgramming class creates an instance of OOPCar using

	OOPCar car = new OOPCar();

- Attributes (Fields):
Each car object stores its own data, such as:

	make
	model
	year
	price
	isRunning

- Methods (Behaviors):
The OOPCar class defines actions a car can perform:

	start()
	stop()
	drive()
	brake()

- State Change:
The isRunning attribute changes dynamically when start() and stop() are called.

- Encapsulation Concept:
Data (attributes) and behavior (methods) are contained within the same object.

*Notes*

Classes define blueprints.
Objects are real instances created from those blueprints.
Attributes hold an object’s state.
Methods define what the object can do.
Together, they make code modular, reusable, and easier to maintain.