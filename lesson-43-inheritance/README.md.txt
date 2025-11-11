Lesson 43 - Inheritance 

This simple Java project demonstrates inheritance, a fundamental concept in Object-Oriented Programming (OOP) where a class (child) inherits attributes and behaviors from another class (parent).

It uses a biological hierarchy analogy — organisms, animals, plants, and specific species — to illustrate how inheritance promotes code reuse, hierarchical organization, and specialized behavior through method overriding. 

*Class Structure*

Inheritance.java              → Main class (entry point)
InheritanceOrganism.java      → Parent class (base class for all living things)
│
├── InheritanceAnimal.java    → Subclass of Organism
│    ├── InheritanceDog.java  → Subclass of Animal
│    └── InheritanceCat.java  → Subclass of Animal
│
└── InheritancePlant.java     → Subclass of Organism

*Key Concepts Demonstrated*

- Multilevel Inheritance:
Dog and Cat inherit from Animal, which inherits from Organism.
Plant also inherits directly from Organism.

- Attribute Inheritance:
All living things (animals and plants) inherit the isAlive property from Organism.

- Method Overriding:
Dog and Cat redefine the speak() method inherited from Animal.

- Independent Behaviors:
Plant inherits life-related attributes but defines its own method photosynthesize().

*Notes*

Common behavior (like being alive or eating) is centralized in higher-level classes.
Specific traits (like barking or meowing) are implemented in subclasses.
Inheritance chains allow for both shared structure and individual specialization.