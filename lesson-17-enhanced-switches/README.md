Lesson 17: Enhanced Switches (Java 14 Feature)

This program demonstrates the use of enhanced switch expressions introduced in Java 14.
They serve as a cleaner and more concise replacement for multiple else if statements, improving readability and reducing repetitive code.

*How It Works*
- The program asks the user to enter a day of the week.
- Using an enhanced switch statement, it checks whether the input is a weekday or part of the weekend.
- If the input doesn’t match any valid day, it displays a message saying it’s not a valid day.

*Key Concepts*
- Enhanced switch syntax:
Uses -> to associate cases directly with expressions or statements.
- Multiple labels per case:
Allows grouping multiple values in a single case (e.g., "Monday", "Tuesday", "Wednesday" -> ...).
- Simplified flow control:
No need for break statements — each case executes exactly one action.

*Why Use Enhanced Switches?*
- Cleaner and more readable code
- Less redundancy
- No accidental fall-through between cases
- Easier maintenance and debugging