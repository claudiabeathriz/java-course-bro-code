Lesson 42 – Static Members

This lesson introduces the concept of static variables and static methods, explaining how they belong to the class itself rather than to individual objects.
Static members are commonly used for shared data, counters, and utility methods.

*Class Structure*

Static.java → Main class (creates objects and accesses static members)
StaticFriend.java → Object class (defines instance data and static shared data)

*Key Concepts Demonstrated*

- Static Variables (Class Variables)
A static variable belongs to the class, not to a specific object.
All instances of the class share the same static variable.

In this lesson:

static int numOfFriends;

Every time a new StaticFriend object is created, this counter increases — regardless of which object is responsible.

- Shared State Across Objects
Although friend1 and friend2 are different objects, they both modify and access the same numOfFriends value.
This demonstrates that static variables act as global state within the class.

- Instance vs Static Members

name → instance variable (each object has its own value)
numOfFriends → static variable (shared by all objects)

This contrast helps clarify when data should belong to an object versus the class itself.

- Static Methods
Static methods belong to the class and do not require an object to be called.

Example:

StaticFriend.showFriends();

Because static methods are not tied to an instance:

They cannot use this
They can only directly access static variables

- Best Practice for Accessing Static Members
Although static variables can be accessed through objects, the recommended approach is to access them via the class name:

StaticFriend.numOfFriends;

This improves code clarity and avoids confusion about ownership.

- Constructor Interaction with Static Data
Each time the constructor is called, the static counter is incremented:

numOfFriends++;

This pattern is commonly used for:

Object counters
Tracking total instances created