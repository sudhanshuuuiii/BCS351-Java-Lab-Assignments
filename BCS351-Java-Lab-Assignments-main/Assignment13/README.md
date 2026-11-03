Assignment 13: Strings – Methods and Palindromes

1. Experiment Title

Strings: Methods and Palindromes

2. Aim

To use common String methods, reverse a word, check a palindrome and print substrings.

3. Software / Tools Required

- Java Development Kit (JDK 27)
- Visual Studio Code
- Windows Operating System

4. Theory

A String in Java is a sequence of characters. Java provides different built-in methods to perform operations on strings.

- "length()" returns the number of characters.
- "indexOf()" finds the position of a character.
- "toUpperCase()" converts a string into uppercase.
- "charAt()" accesses a character at a particular index.
- "equals()" compares two strings.
- "substring()" extracts a part of a string.

A palindrome is a word that reads the same from both ends.

5. Algorithm / Procedure

Question 1: String Methods

1. Store the word Programming in a String.
2. Use "length()" to find its length.
3. Use "indexOf()" to find the first position of g.
4. Use "toUpperCase()" to convert the word into uppercase.
5. Print all three results.

Question 2: Reverse a String

1. Store the word Java.
2. Initialize an empty string named reversed.
3. Use a loop to access characters from the last position to the first.
4. Use "charAt()" and concatenation to build the reversed word.
5. Print the reversed word.

Question 3: Check Palindrome

1. Store the word racecar.
2. Reverse the word using a loop.
3. Compare the original and reversed strings using "equals()".
4. Print whether the word is a palindrome.

Question 4: Print All Substrings

1. Store the word abc.
2. Use two nested loops.
3. Use "substring()" to extract each part of the word.
4. Print every substring from shortest to longest for each starting position.

6. Input

- Question 1: Programming
- Question 2: Java
- Question 3: racecar
- Question 4: abc

7. Output

Question 1


Length: 11
Position of g: 3

Upper case: PROGRAMMING


Question 2

Reversed: avaJ


Question 3


racecar is a palindrome


Question 4

a

ab

abc

b

bc

c

8. Result

Successfully implemented Java String methods, reversed a string, checked a palindrome and printed all substrings.
