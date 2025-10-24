# Lesson 11 - Nested If Statements

This lesson introduces **nested if statements**, where one `if` statement is placed inside another to evaluate multiple conditions and control the program flow more precisely.

## Topics Covered
- Using nested `if` and `else` statements
- Boolean logic to apply different conditions
- Applying discounts based on multiple criteria
- Updating variable values using arithmetic operators
- Using `System.out.printf()` for formatted output

## Program Logic
- If the user **is a student**, they get a **10% discount**.  
- If the user **is a senior** (and also a student), they get **both discounts**, resulting in a **30% total discount**.  
- If the user **is only a senior**, they receive a **20% discount**.  
- If the user is **neither**, the full price applies.  

## Learning Notes
- Nested `if` structures allow checking multiple related conditions in sequence.
- Indentation is important for readability when using nested conditions.
- Multiplying `price` by a factor (e.g., `price *= 0.9`) updates the value based on the discount.
- Combining boolean flags (`isStudent`, `isSenior`) helps simulate real-world decision logic.
