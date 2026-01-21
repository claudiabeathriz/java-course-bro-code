Lesson 14 - Weight Converter  

This Java program converts **weights** between pounds (lbs) and kilograms (kgs).  
It allows the user to choose the conversion direction and then performs the appropriate calculation.

*Concepts Covered*
- User input with `Scanner`
- Conditional statements (`if`, `else if`, `else`)
- Mathematical operations
- Output formatting with `System.out.printf()`

*Code Explanation*

System.out.println("1. Convert lbs to kgs");
System.out.println("2. Convert kgs to lbs");
choice = scanner.nextInt();
The user selects one of the two conversion options.
Then, depending on the choice:

1️⃣ Convert lbs → kgs

newWeight = weight * 0.453592;
Multiplies by 0.453592 to convert pounds into kilograms.

2️⃣ Convert kgs → lbs

newWeight = weight / 0.453592;
Divides by 0.453592 to convert kilograms into pounds.

If the user inputs an invalid option, the program prints: Not a valid choice.

*Notes*
- The conversion factor used is 1 lb = 0.453592 kg.
- The program uses printf for two-decimal precision in the output.
- Always closes the Scanner at the end to prevent resource leaks.
