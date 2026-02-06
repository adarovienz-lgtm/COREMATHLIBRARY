Core Math Library
Vienz Edhrian O. Adaro

DESCRIPTION:
The goal was to build a program that can do different math calculations (like Arithmetic, Geometry, and Number Analysis) but organized into different classes instead of one big file.

HOW I DESIGNED IT:
I used inheritance to make sure I didn't have to copy-paste code for storing results.

1. MathOperation (Parent Class)
   I made this the base class for everything. It has a private variable called result to hold the answers. I used encapsulation here to keep the data safe.

2. Arithmetic (Sub Class)
   This extends MathOperation. It handles the basic math stuff.

3. Geometry (Sub Class)
   It calculates Area and Circumference for Circles, and Area and Perimeter for Rectangles.

4. NumberAnalysis (Sub Class)
   This handles specific number checks. It checks if a number is Prime, calculates Factorials, and determines if a number is Even or Odd.

HOW TO RUN IT:
Just run the Main.java file.