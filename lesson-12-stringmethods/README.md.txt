# Lesson 12 - String Methods

This lesson explores **String methods** in Java — built-in functions that allow you to inspect, modify, and manipulate text data efficiently.

## Topics Covered
- Basic String operations:
  - `.length()` — returns the number of characters in a string  
  - `.charAt(index)` — returns the character at the specified index  
  - `.indexOf(char)` / `.lastIndexOf(char)` — find the first or last occurrence of a character  
  - `.toUpperCase()` / `.toLowerCase()` — change letter casing  
  - `.trim()` — remove extra spaces from both ends  
  - `.replace(oldChar, newChar)` — replace one character with another  
- Conditional checks:
  - `.isEmpty()` — checks if the string is empty  
  - `.contains(" ")` — checks if the string contains a space  
  - `.equalsIgnoreCase("text")` — compares strings ignoring case sensitivity  

## Learning Notes
- Strings in Java are **immutable**, meaning methods like `.replace()` or `.toUpperCase()` return a *new* string instead of modifying the original one.  
- Checking for empty strings (`isEmpty()`) is important to prevent unexpected errors in user input.  
- Using `.equalsIgnoreCase()` allows safer comparisons when user input may vary in letter case.  
- String manipulation is one of the most common operations in everyday programming, from user input validation to formatting text for display.
