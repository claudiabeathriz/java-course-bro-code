Lesson 23 - Break and Continue

This lesson introduces two important control statements in Java — break and continue — which allow to alter the normal flow of loops.

*Topics Covered*

- break statement
	Immediately terminates the loop, even if the condition is still true.
	Useful when a certain condition means continuing is no longer necessary.

	if (i == 5) {
    	break;
	}

→ Stops the loop completely when i equals 5.

- continue statement

	Skips the current iteration and moves to the next one.
	Commonly used when you want to ignore specific values or cases.

	if (i == 5) {
    	continue;
	}

→ Skips printing 5 but continues the loop.

*Notes*

Overusing them can make code harder to read; use only when logic requires early exit or skipping.
