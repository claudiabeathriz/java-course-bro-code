Lesson 40 - Overloaded Constructors

This lesson introduces overloaded constructors, which allow a class to have multiple constructors with different parameter lists.
They provide flexibility in how objects are initialized — enabling the creation of objects even when not all data is available at instantiation.

*Class Structure*
OverloadedConstructors.java        → Main class (creates and prints user objects)
OverloadedConstructorsUser.java    → Subclass (defines attributes and overloaded constructors)

*Key Concepts Demonstrated*

- Constructor Overloading:
A class can have multiple constructors that differ in:

	Number of parameters
	Type of parameters
	Order of parameters

Java automatically determines which constructor to call based on the arguments passed when creating the object.

- Default Constructor:
When no arguments are provided, the default constructor sets the object’s attributes to predefined default values:

	username = "Guest"
	email = "Not provided"
	age = 0

- Chaining Behavior (Manual Setup):
Each constructor assigns initial values to the attributes directly.
(Constructor chaining using this() could also be used, but is not demonstrated here.)

- Initialization Flexibility:
The OverloadedConstructorsUser class can be initialized in four ways:

	No arguments → default user
	One argument → username only
	Two arguments → username + email
	Three arguments → username + email + age

- Field Access:
The main class prints out each user’s data to demonstrate how constructors populate attributes differently.