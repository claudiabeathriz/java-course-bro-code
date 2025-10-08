# Lesson 13 - Substrings

This lesson introduces the **`.substring()`** method in Java, which is used to extract portions of a string based on starting and ending index positions.

## Topics Covered
- Using `.substring(start, end)` and `.substring(start)`  
- Finding character positions with `.indexOf()`  
- Checking if a string contains a character using `.contains()`  
- Extracting username and domain from an email address  
- Handling invalid input with conditional statements  

## Program Logic
1. The user enters an email address.  
2. The program checks if the input contains an `"@"` symbol.  
3. If it does:
   - The part before `@` is extracted as the **username**.
   - The part after `@` is extracted as the **domain**.  
4. If it doesn’t, an error message is displayed.  

## Learning Notes
- `.substring(start, end)` extracts characters from `start` (inclusive) to `end` (exclusive).  
- `.substring(start)` extracts from `start` to the end of the string.  
- `.indexOf("@")` helps locate where to split the string.  
- Input validation using `if (email.contains("@"))` prevents runtime errors.  
- This type of logic is useful for **string parsing**, such as handling emails, URLs, or file paths.
