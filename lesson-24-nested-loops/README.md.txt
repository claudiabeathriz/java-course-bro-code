Lesson 24 - Nested Loops

This lesson introduces nested loops in Java — loops placed inside other loops — which are often used for working with grids, matrices, and multi-dimensional data. It strengthens understanding of iteration within iteration, a core concept in matrix operations, sorting algorithms, and pattern generation.

*Topics Covered*

- Nested loop structure

	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
        	// code executed for each cell in the grid
    		}
	}

	The outer loop controls the number of rows.
	The inner loop runs completely for each iteration of the outer loop (columns).

- Practical use
	Displaying patterns or tables
	Iterating over 2D arrays or matrices
	Building grid-based games or visual layouts

*Example (drawing a rectangle)*

	for (int i = 0; i < rows; i++) {
    		for (int j = 0; j < columns; j++) {
        	System.out.print(symbol);
    		}
    	System.out.println();
	}

→ Creates a grid of symbol characters with the given number of rows and columns.

*Notes*

Outer loop → determines how many lines or levels are created.
Inner loop → determines how many elements per line or per level.
Each time the inner loop finishes, control returns to the outer loop for the next iteration.

Example Input:

Enter # of rows:
3
Enter # of columns:
5
Enter the symbol to use:
#

Example Output:

#####
#####
#####