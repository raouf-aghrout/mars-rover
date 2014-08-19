Mars Rover
==========

A squad of robotic rovers are to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular,
must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to
send back to Earth.

A rover’s position and location is represented by a combination of x and y co-ordinates and a letter representing one of
the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position
might be 0, 0, N, which means the rover is in the bottom left corner and facing North.

In order to control a rover, NASA sends a simple string of letters. The possible letters are ‘L’, ‘R’ and ‘M’. ‘L’ and ‘R’
makes the rover spin 90 degrees left or right respectively, without moving from its current spot. ‘M’ means move forward
one grid point, and maintain the same heading.

Assume that the square directly North from (x, y) is (x, y+1).

Input: The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to
be 0,0.

The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of
input. The first line gives the rover’s position, and the second line is a series of instructions telling the rover how
to explore the plateau.

The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and
the rover’s orientation.

Each rover will be finished sequentially, which means that the second rover won’t start to move until the first one has
finished moving.

Output: The output for each rover should be its final co-ordinates and heading.

Input and Output
 
Test Input:

 5 5
 1 2 N
 LMLMLMLMM
 3 3 E
 MMRMMRMRRM

Expected Output:

 1 3 N
 5 1 E

Design Choices
==============

I wanted to implement my code in a clean and intuitive way, hence I have chosen to go against heavily commenting my
code, and rather opting to name my tests, methods and variables in an intuitive way that anybody can follow. I have
aimed to make the code as small and concise as possible.

I began by identifying the Objects and Interfaces I would need, the Plateau, Rover, Direction, Command. I implemented
these as the very basic POJO's, as well as this I also created an empty MarsRover entry class and a InputUtil utility
class for reading in the input. I then began looking at using Design Patterns and Test Driven Development.

I wanted to demonstrate, as per the specification, that I could use strong Object Oriented (OO) programming concepts, so
I have attempted to implement two Design Patterns that I studied for this task. Firstly I studied and implemented the
State design pattern to represent the different Directions a Rover can have as States, as there was a need for different
functionality on the behaviours of the Rover dependent on which Direction (State) it was in. Secondly I studied and
implemented the Command design pattern for sending and executing the various Commands the Rover needed to execute.
This is my first solo delve into these Design Patterns and so I appreciate this may not be a completely accurate
implementation of them.

I come from a non TDD background, so I have researched this and attempted to complete this problem using only a TDD
approach. I followed the Red, Green, Refactor approach, as such all of my test were written first, then ran and broken
(Red), then I implemented the code / logic (Green) and finally any refactoring that was needed. I have implemented all
of my tests using JUnit and have included a Test Suite class to enable them to all be run at once. Again, this is my
first real delve into TDD solo, so I may be lacking test coverage in some areas and have over tested in others.

In conclusion I'd love the opportunity to discuss both the Design Pattern implementations and TDD approach further with
your developers, as I'm sure there's a lot I can learn and improve in these aspects.

Assumptions
===========

- When a Plateau is created, the bottom right co-ordinates are always (0, 0)
- The square directly North from (x, y) is (x, y + 1)
- The test input and output is always the same, clean and present, so this doesn't need to be validated

Development Environment
=======================

I developed this in the following application:

- Java SE 1.7
- IntelliJ IDEA 13.0.3 Community Edition
- MyEclipse Enterprise Workbench 2014 (Eclipse 4.3.1 Based)

Note - I wanted to make sure their was support for both of these development environments, please ensure that your
version of Java in your project facets is set to Java 1.7, and the compiler you are using is Java 1.7, whichever IDE you
import into.

3rd Party Libraries Used:
=========================

- Build Tool: Apache Maven 3.1.1
- Test Tool:  JUnit 4.11

Note - Apache Maven should handle the JUnit dependency, so there should be no need to manually do this. You will however
need to have Apache Maven downloaded locally and point your IDE to your 'M2_HOME' directory.

Execution
=========

To get up and running with the code:

- Import and setup the project in your chosen IDE
- Run the Maven 'clean' and 'install' life cycles, this will run all the tests in Maven and build you a .jar
- Run the MarsRover class, this will test the input and output in the command line

Alternatively you can run the code in the command line, from the root Project folder, in this case inside MarsRover:

Maven:
- This will run a clean, run all of the tests and package a .jar file.
    - mvn clean install

Java:
- This will run the executable .jar file you just packaged with Maven.
    - java -jar target\MarsRover-1.0-SNAPSHOT.jar

Note - For the second option you will need to have Java and / or Maven in your Path variables if you are using Windows
or verify your installation in Unix / Mac OS. For help, see:

Windows - http://www.mkyong.com/maven/how-to-install-maven-in-windows/

Unix - http://www.mkyong.com/maven/how-to-install-maven-in-ubuntu/

Mac OS - http://www.mkyong.com/maven/install-maven-on-mac-osx/

Possible Extensions
===================

- Handle incorrect input, from file or otherwise, that needs validating first
