# Lesson: Mad Libs Game

This is a simple **Mad Libs game** implemented in Java.  
The game asks the user to input words (adjectives, nouns, verbs) and then generates a funny short story using those words.

## Code
- `MadLibsGame.java` contains the full program.

## How It Works
1. The program prompts the user to enter:
   - Adjectives (descriptions)
   - Nouns (animals, people, or objects)
   - Verbs (ending with -ing)
2. The input words are stored in variables.
3. The program combines the words into a short story and prints it to the console.

## Example Run
Enter an adjective (description):
funny
Enter a noun (animal/person):
monkey
Enter a adjective (description):
silly
Enter a verb (ending with -ing):
dancing
Enter an adjective (description):
amazed

Output:
Today I went to a funny zoo.
In an exhibit, I saw a monkey
monkey was silly and dancing!
I was amazed!

markdown

## How to Compile & Run
1. Open a terminal in the folder containing `MadLibsGame.java`.  
2. Compile:
javac MadLibsGame.java

markdown

3. Run:
java MadLibsGame

pgsql

## Notes
- The game uses `Scanner` to read user input from the console.  
- All variables are of type `String`.  
- Always close the `Scanner` after use (`scanner.close()`) to avoid resource leaks.