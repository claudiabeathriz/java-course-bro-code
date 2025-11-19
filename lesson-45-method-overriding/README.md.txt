Lesson 45 - Method Overriding

Method overriding occurs when a subclass provides its own implementation of a method that is already defined in its superclass.

It allows:

- Code reusability – common behavior is defined in the superclass.
- Specific implementation – each subclass can define behavior specific to itself.

*Project Structure*

The project consists of:

Superclass: MethodOverridingAnimal
	Contains a general method move() that can be overridden by subclasses.

Subclasses:
	MethodOverridingDog
	MethodOverridingCat
	MethodOverridingFish – overrides move() to show how a fish swims.

Main Class: MethodOverriding
	Creates instances of each animal subclass and calls their move() methods.

