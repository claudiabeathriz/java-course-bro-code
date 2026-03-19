Lesson 52 - Aggregation

This lesson introduces aggregation, a concept in object-oriented programming that represents a “has-a” relationship between objects.
In aggregation, one object contains references to other objects, but those objects can exist independently of the container.

*Topics Covered*
- Understanding “has-a” relationships between classes
- Creating objects that contain other objects
- Using arrays of objects as attributes
- Difference between aggregation and composition
- Organizing related data using object relationships

*Notes*
- In aggregation, the contained objects (e.g., Book) can exist without the container object (e.g., Library).
- This differs from composition, where the contained objects depend on the container’s lifecycle.
- Aggregation improves modularity and reusability by allowing objects to be shared across different parts of a program.
- It is commonly used to model real-world relationships, such as a library having book.