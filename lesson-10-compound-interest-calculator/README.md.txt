Lesson 10 - Compound Interest Calculator

This lesson demonstrates how to calculate **compound interest** in Java using user input and mathematical operations.

*Topics Covered*
- Reading user input with `Scanner`
- Applying the compound interest formula
- Using `Math.pow()` for exponentiation
- Formatting numeric output with `System.out.printf()`
- Combining text and formatted variables in console output

*Formula Used*
The compound interest formula is:
A = P * (1 + r/n)^(n * t)

Where:  
- `A` = final amount  
- `P` = principal (initial amount)  
- `r` = annual interest rate (in decimal form)  
- `n` = number of times interest is compounded per year  
- `t` = time in years  

*Notes*
- `Math.pow(base, exponent)` is used to raise numbers to a power.
- Division by `100` converts percentage input into a decimal rate.
- The use of `printf()` allows controlling decimal precision, which is useful for displaying currency values.
- This type of program is commonly used in finance-related applications.
