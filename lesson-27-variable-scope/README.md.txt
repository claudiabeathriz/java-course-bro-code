Lesson 27 - Variable Scope

This lesson introduces variable scope, which determines where a variable can be accessed in a Java program. Understanding scope helps prevent errors and ensures that variables are used correctly within methods, blocks, and classes.

*Topics Covered*

- Difference between class variables and local variables
- Scope of variables within methods, blocks, and the class
- Shadowing: when a local variable has the same name as a class variable
- Rules for declaring variables in nested blocks

*Program Logic*

A class variable x is declared at the class level and is accessible anywhere within the class (unless shadowed).
A local variable x declared inside main shadows the class variable for that method.
Another local variable x declared inside the doSomething method is only accessible within that method.
Variables declared inside blocks (e.g., { ... }) cannot be accessed outside the block.

*Example*

    // Code here CANNOT use x

    //{ // This is a block

        // Code here CANNOT use x

        //int x = 100;

        // Code here CAN use x
        //System.out.println(x);

    //} // The block ends here

    // Code here CANNOT use x

*Notes*

Class variables are accessible to all methods of the class unless shadowed by a local variable with the same name.
Local variables exist only within the method or block where they are declared.
Using the same variable name in different scopes is allowed, but the local variable hides the class variable temporarily.
Blocks { ... } can create smaller scopes for variables, which helps organize code and prevent accidental changes to other variables.