Lesson 46 - toString Method

This lesson introduces the **toString()** method in Java, which is inherited from the Object class and is used to return a string representation of an object.
By default, it returns a memory reference (hash code), but it can be overridden to display meaningful and readable information.

*Topics Covered*
- What the toString() method is
- Default behavior of toString() in Java
- Overriding methods using @Override
- Converting object attributes into a readable string
- How System.out.println(object) automatically calls toString()

*Notes*
- Every Java class inherits the toString() method from the Object class.
- If not overridden, printing an object will show a hash code instead of useful data.
- Overriding toString() improves readability, debugging, and logging.
- This is a common and recommended practice in object-oriented programming.