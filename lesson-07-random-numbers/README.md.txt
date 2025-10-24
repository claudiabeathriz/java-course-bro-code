# Lesson 07 - Random Numbers

This lesson introduces generating **random numbers** in Java using the `Random` class from the `java.util` package.

## Topics Covered
- Importing and using `java.util.Random`
- Generating random numbers:
  - `nextDouble(min, max)` → Returns a double value between `min` (inclusive) and `max` (exclusive)
  - Other methods (not used here but common): `nextInt()`, `nextBoolean()`, `nextFloat()`, etc.
- Storing and printing random values
- Using variables to hold random output

## Learning Notes
- The `Random` class provides methods for generating different types of random values.
- Creating a `Random` object is necessary before generating random numbers: `Random random = new Random();`
- Random numbers are commonly used in games, simulations, testing, and scenarios where unpredictability is needed.
