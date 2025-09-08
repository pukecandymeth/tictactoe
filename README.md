# Tic-Tac-Toe CLI Game in Java

A **basic command-line Tic-Tac-Toe game** for two players. This project is ideal for beginners learning **Java fundamentals** like arrays, loops, and conditionals.

## Features

* Two-player gameplay (X and O)
* 3x3 grid displayed in the console
* Players choose positions 1-9 to place their symbol
* Detects when the grid is full
* Simple and easy to understand

## How to Play

1. Compile the Java file:

```bash
javac ttt2.java
```

2. Run the game:

```bash
java ttt2
```

3. Players take turns entering a number (1-9) corresponding to the position on the grid:

```
Positions on the grid:

1 | 2 | 3
--+---+--
4 | 5 | 6
--+---+--
7 | 8 | 9
```

4. Game continues until the grid is full.

   * No automatic win detection (game ends when board is full).

## Code Structure

* `isFull` → checks if the grid is full
* `printGrid` → prints the current board
* `place` → places a symbol in the chosen position
* `isPositionEmpty` → ensures players don’t overwrite moves
* `main` → game loop handling player input and turns

## Notes

* This is a **simple learning project** with no AI or GUI.
* Great for practicing **loops, conditionals, and arrays** in Java.
