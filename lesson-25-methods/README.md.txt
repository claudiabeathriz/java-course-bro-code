Lesson 25 - Methods

This lesson introduces methods in Java — blocks of reusable code that execute when called. Methods help organize programs, reduce repetition, and improve readability by following the D.R.Y. principle (Don’t Repeat Yourself). They make the code modular, maintainable, and scalable.

*Topics Covered*

- Create a method

A method must be declared within a class. It is defined with the name of the method, followed by parentheses ()

	static void methodName() {
	    // code
	}

- Types of methods

void → performs an action but does not return a value.
with return type → returns a result (e.g., int, double, boolean, String).

- Parameters and arguments

Parameters → placeholders inside the method definition.
Arguments → actual values passed when calling the method.

	static void greet(String name) {
    		System.out.println("Hello, " + name);
	}

	greet("Claudia"); // “Claudia” is the argument

- Return values

Methods can return values using the return keyword:

	static double square(double number) {
    		return number * number;
	}

- Boolean methods

Used for decision-making:

	static boolean ageCheck(int age) {
    		return age >= 18;
	}

*Notes*

Methods improve organization, readability, and reusability.
They can accept inputs (parameters) and return outputs (return values).
Use static when defining methods inside the same class as main().
Good method naming follows verbs for actions (e.g., calculateArea, printMessage) and nouns for return values (e.g., getFullName).
