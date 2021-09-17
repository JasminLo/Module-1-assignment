# Module 1 Assignment
## The Little Animal Horror Zoo

Imagine that you are designing a computer game. The game is text based, meaning that no graphics are involved, so only a text story printed in the console.

The game is at the moment not able to take any instructions from the person who plays the game (you), but it can only do what you will code it to do. You can think of it as a “Demo” game that shows how it could be played, but in fact is not playable yet.

The game consists of 2 animals: a rabbit and a snake. The screen consists of coordinate system with an x and y axis, 10 on each axis. So the animals can be located by the number they are on. In this text based game you can not see where the animals are at a given time, but they should “tell” it to the console, every time they have moved, like this:

“I am the nice rabbit, i am now standing on square 1, 3”
“I am the evil snake, i am now standing on the square 3, 10”

So both the rabbit and the snake should be able to move. And they should both be able to tell about their position. The snake should be able to kill the rabbit if they are on the same coordinates. And the rabbit should be able to ask for mercy just before it is killed, maybe if the snake is on a neighboring square.

## Hand in:

- Your Java code
- Use cases
- Domain Model
- Class Diagram
- Other, eg. comments/thoughts etc.

If you create multiple versions of use cases, domain model or class diagram, you should hand in each version with a version number on them.

Your hand in must be a repository on Github and you must upload a link to the repository on Fronter.

# Possible Solution:

The code in this branch contains 3 Java Classes: Main, Console and Animal.

The **Main Class** creates a Console and plays the game.

The **Console Class** creates the Animals (Snake and Rabbit), gives them a default position (the same in each game) and has methods that deal with logic of the game (such as dangerZone, that checks whether the Snake and the Rabbit are in adjacent positions (not diagonal); and the killZone, that checks if the Animals are in the same position). The Class translates the animals and prints different statements depending on the result of the dangerZone, killZone and gameOver booleans.

The **Animal Class** takes care of some mechanics related to the animals, such as translation and printing of information about the position.


