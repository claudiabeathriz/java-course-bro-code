# Lesson 03 - Arithmetic Operators

This lesson introduces **arithmetic operators** in Java, along with **augmented assignment operators**, **increment/decrement operators**, and **order of operations (PEMDAS)**.

---

## Topics Covered
- Arithmetic Operators: `+`, `-`, `*`, `/`, `%`
- Augmented Assignment Operators: `+=`, `-=`, `*=`, `/=`, `%=`
- Increment and Decrement Operators: `++`, `--`
- Order of Operations (PEMDAS)

---

## Order of Operations (PEMDAS)

PEMDAS is an acronym to remember the **priority of operations** in math and Java:

| Letter | Meaning         | Example in Java            | Result |
|--------|----------------|---------------------------|--------|
| P      | Parentheses     | `(2 + 3) * 4`             | 20     |
| E      | Exponents       | `Math.pow(2, 3)`          | 8      |
| M      | Multiplication  | `3 * 4 + 2`               | 14     |
| D      | Division        | `10 / 2 + 3`              | 8      |
| A      | Addition        | `2 + 3 * 4`               | 14     |
| S      | Subtraction     | `10 - 3 * 2`              | 4      |

**Notes:**
- Multiplication (`*`) and Division (`/`) have the same priority → evaluate **left to right**.
- Addition (`+`) and Subtraction (`-`) have the same priority → evaluate **left to right**.
- Always resolve **Parentheses first**.
- Exponents can be done using `Math.pow(base, exponent)` in Java.

---

## How to Compile & Run

1. Open a terminal in the folder containing `Arithmetic.java`.  
2. Compile the program:  
```bash
javac Arithmetic.java

3. Run the program:

java Arithmetic