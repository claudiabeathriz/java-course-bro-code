Lesson 21 - Number Guessing Game (While Loop Practice)

This lesson puts while loops, conditionals, and random number generation into practice by building a simple Number Guessing Game. The program challenges the user to guess a randomly generated number until they get it right.

*Topics Covered*

- Random number generation with java.util.Random
	Random random = new Random();
	int randomNumber = random.nextInt(min, max + 1);

	Generates a random integer between min and max (inclusive).

- User input with Scanner
	Reads the user’s guesses using scanner.nextInt().

- Loop control with do-while

	do {
    	// ask for a guess
	} while (guess != randomNumber);

	Ensures the guessing prompt runs at least once and repeats until the correct number is guessed.

- Conditional logic (if / else if / else)
	Provides feedback (“Too low”, “Too high”) and counts the number of attempts.

- Using constants (final)
	final int min = 1; and final int max = 100; define fixed range values.

*Notes*

The do-while loop is ideal when you want the block to run at least once before checking the condition.