Lesson 33 - Varargs

This lesson introduces varargs (variable-length arguments) in Java, which allow methods to accept a flexible number of parameters. Instead of creating multiple overloaded methods, varargs handles different numbers of arguments using a single method definition. Java automatically stores the arguments in an array.

*Topics Covered*

- Using ... (ellipsis) for variable arguments
- Interating over varargs with enhanced for loops
- Simplifying overloaded methods
- Calculating sums and averages with flexible input sizes

*Notes*

Use ... after a type to define a varargs parameter, e.g., int... numbers.
Inside the method, the varargs parameter behaves like an array.
Only one varargs parameter is allowed per method, and it must be the last parameter in the list.