Lesson 47 - Abstraction

Abstraction is the process of hiding implementation details and exposing only the essential features of an object. In Java, abstraction is achieved using abstract classes and abstract methods.

It allows:
- Code organization – common attributes and behaviors can be defined in an abstract superclass.
- Implementation flexibility – subclasses must provide their own implementation of abstract methods.
- Encapsulation of complexity – users interact only with the necessary functionality without needing to understand the internal logic.

*Topics Covered*
- Abstract classes cannot be instantiated directly.
- Abstract classes may contain:
  - Abstract methods (methods without implementation that must be implemented by subclasses). 
  - Concrete methods (methods with implementation that can be inherited by subclasses).

*Project Structure*

The project consists of:

Abstract Class: ShapeAbstraction
Contains the abstract method area() and the concrete method display() that can be inherited by subclasses.

Subclasses:

CircleAbstraction – implements the area() method to calculate the area of a circle.

TriangleAbstraction – implements the area() method to calculate the area of a triangle.

SquareAbstraction – implements the area() method to calculate the area of a square.

Main Class: Abstraction
Creates instances of each shape and demonstrates how abstraction works by calling the display() and area() methods.

Each subclass provides its own implementation of the area() method while sharing common behavior defined in the abstract class.