Lesson 49 - Polymorphism

This lesson introduces polymorphism in Java, a core concept of object-oriented programming where objects can take on many forms.
It allows different classes to be treated as instances of a common superclass, enabling flexible and reusable code.

*Topics Covered*
- Definition of polymorphism (poly = many, morph = form)
- Using a common superclass to reference different object types
- Method overriding in subclasses
- Runtime polymorphism with dynamic method dispatch
- Using arrays of superclass type to store different objects

*Notes*
- A superclass reference (e.g., Vehicle) can refer to any of its subclass objects (Car, Bike, Boat).
- The method that gets executed depends on the actual object type at runtime, not the reference type.
- Polymorphism improves code flexibility, scalability, and maintainability.
- Abstract classes (like Vehicle) are often used to define common behavior that subclasses must implement.