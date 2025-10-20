Lesson 02 - User Input (Scanner)

This lesson introduces user input in Java using the Scanner class.
The Scanner allows us to read values typed by the user, such as text, numbers, or booleans.

Topics Covered

Importing the Scanner class

Creating a Scanner object

Reading different data types (String, int, double, boolean)

Using nextLine() vs nextInt(), nextDouble(), etc.

Handling the input buffer issue (cleaning with nextLine())

Quick Reference: Scanner Methods
Data Type	Scanner Method	Example Input
String	nextLine()	"Claudia"
int	nextInt()	25
double	nextDouble()	3.75
boolean	nextBoolean()	true / false

⚠️ Important: after methods like nextInt() or nextDouble(), always call nextLine() to clear the buffer if you plan to read a String afterward.

Code Example

See UserInput.java
 for the complete code.