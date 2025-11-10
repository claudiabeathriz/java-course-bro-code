Lesson 28 - Banking Program

This lesson introduces a simple console-based banking application, designed to help beginners practice Java fundamentals such as loops, conditionals, methods, and user input handling. The program simulates basic banking operations like checking balance, depositing money, and withdrawing funds.

*Topics Covered*

- Using a while loop to keep a program running until the user chooses to exit
- Implementing methods to organize functionality (showBalance, deposit, withdraw)
- Handling user input with the Scanner class
- Applying conditional logic to validate transactions
- Using a switch statement for menu navigation

*Program Logic*

The program starts with a balance of 0 and runs continuously until the user selects “Exit.”

The user can choose from the following options:

Show balance — Displays the current account balance.
Deposit — Prompts the user to enter an amount and adds it to the balance (only if it’s positive).
Withdraw — Prompts the user for an amount and deducts it from the balance if sufficient funds are available.
Exit — Terminates the program gracefully with a thank-you message.

Invalid menu choices display an error message without crashing the program.

*Notes*

Always close the Scanner to free system resources.
Input validation prevents negative deposits and withdrawals that exceed the balance.
Using separate methods for each operation improves readability and modularity.
switch expressions (using ->) simplify case handling and reduce boilerplate code.
