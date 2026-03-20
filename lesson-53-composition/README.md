Lesson 53 - Composition

This lesson introduces composition, a concept in object-oriented programming that represents a “part-of” relationship between objects.
In composition, one object is made up of other objects, and those contained objects depend on the lifecycle of the main object.

*Topics Covered*
- Understanding “part-of” relationships between classes
- Building complex objects from smaller components
- Accessing nested object attributes (e.g., car.engine.type)
- Difference between composition and aggregation
- Object lifecycle dependency

*Notes*
- In composition, the contained object (e.g., Engine) cannot exist independently of the container (e.g., Car).
- If the main object is destroyed, its parts are also destroyed.
- Composition promotes strong relationships between objects and better organization of complex systems.
- It is commonly used to model real-world structures, such as a car made up of an engine.