# javacodesforbeginners
java beginner
functions in every programming language - block of code that performs tasks
class- yo vaneako tah cointainer for related functions

access modifier in java- public private and protected
package statement is terminated with the semicolon


void aayo vane chai yesle value return gardaina
methods vaneako chai functions ko bhitra lekhincha

VARIABLES IN JAVA

        String name="supreme";
        int age=25;
        String neighbour="surya";
variables lae chai alag alag values lai store garna sakxau different locations ma
        String friend=neighbour; // friend is a reference to the same object as neighbour ||hami lae variables ko value aaru ma assign garna sakxam

JAVA TYPES
PRIMITIVE TYPES 
//byte -1 [-128 to 127] bytes
//short -2 bytes
//int -4 bytes
//float-4
//long -8
//boolean-1
//char-2
//double-8

yesma length ko capacity fixed huncha
refrencing type ho yo yesma chai reference diyeako hunca memory allocate garna lai
 Date now = new Date(); //new operater use gareako chai memory allocate garna lai
        System.out.println(now);

non -premitive types yesko length ko capacity chai fixed hunna jati ni huna sakxa
yeslai chai new keyword ko help lae declare garna parxa


STRING AND CONCATINATION


ystem.out.println(name1.charAt(1));   // indexing gareako

Arrays 
it have a fixed length
for simple arrays System.out.println(Arrays.toString(numbers));

deep to string is used to print multidiamensional arrays
System.out.println(Arrays.deepToString(numbers));

# Java Project Basics

This project contains basic Java code examples, demonstrating various concepts such as arithmetic operations, casting, formatting numbers, and usage of the Math class.

## Files

1. `ArthmeticOperations.java`: This file demonstrates basic arithmetic operations, increment and decrement operators, compound assignment operators, and order of operations.

2. `CastingInJava.java`: This file demonstrates implicit and explicit casting in Java, as well as casting with strings.

3. `FormattingNumbers.java`: This file is intended to demonstrate number formatting in Java.

4. `TheMathClass.java`: This file demonstrates the usage of various methods from the Math class in Java, such as `round`, `ceil`, `max`, `floor`, and `random`.

## How to Run

To run any of these files, navigate to the `src/javaprojectsbasics/` directory and use the `java` command followed by the filename (without the .java extension). For example:

```bash
java ArthmeticOperations
# Reading Input in Java

This file, `ReadingInput.java`, demonstrates how to read input from the user in Java.

## File Description

`ReadingInput.java`: This file uses the `Scanner` class from the `java.util` package to read user input from the console. It prompts the user to enter their name and age, and then prints these values back to the console.

## How to Run

To run this file, navigate to the `src/javaprojectsbasics/` directory and use the `java` command followed by the filename (without the .java extension). For example:

```bash
java ReadingInput
