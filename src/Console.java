import java.awt.*;

public class Console {
    // Create the animals, and add the dangerZone and killingZone methods here.
    // Make this class handle all the hassle, so main only plays the game.
    private Animal rabbit = new Animal("Rabbit", new Point(1, 1));
    private Animal snake =  new Animal("Snake", new Point(1, 5));
    private boolean gameOver = false;

    // playGame method. Hardcoded translations, always the same, to enforce an encounter.
    public void playGame(){
        this.printInfo(rabbit);
        rabbit.translate(0, 1, this.gameOver);
        this.printInfo(snake);
        snake.translate(0, -1, this.gameOver);
        this.printInfo(rabbit);
        rabbit.translate(0, 1, this.gameOver);
        this.printInfo(snake);
        snake.translate(0, -1, this.gameOver);
        this.printInfo(rabbit);
        rabbit.translate(0, 1, this.gameOver);
        this.printInfo(snake);
        snake.translate(0, -1, this.gameOver);
    }

    // Method to check if Rabbit and Snake are in proximity.
    public boolean dangerZone(){
        if (rabbit.getPosition().x == snake.getPosition().x && rabbit.getPosition().y == snake.getPosition().y - 1){
            return true;
        } else if (rabbit.getPosition().x == snake.getPosition().x && rabbit.getPosition().y == snake.getPosition().y + 1){
            return true;
        } else if (rabbit.getPosition().x == snake.getPosition().x - 1 && rabbit.getPosition().y == snake.getPosition().y){
            return true;
        } else if (rabbit.getPosition().x == snake.getPosition().x + 1 && rabbit.getPosition().y == snake.getPosition().y){
            return true;
        } else {
            return false;
        }
    }

    // Method to check if the Rabbit and the Snake are on the same coordinates.
    public boolean killZone(){
        if (rabbit.getPosition().x == snake.getPosition().x && rabbit.getPosition().y == snake.getPosition().y){
            this.gameOver = true;
            return true;
        } else {
            return false;
        }
    }

    public void printInfo(Animal animal) {
        if (!this.gameOver){
            if (this.dangerZone()) {
                System.out.println("'Noooo, please! Don't eat me!'");
            } else if (this.killZone()) {
                System.out.println(/*"Snake is in the same position as Rabbit. Snake says:*/ "'Hahaha, I'm eating you!'");
                System.out.println("GAME OVER MAN, GAME OVER");
            } else {
                animal.printPosition();
            }
        }
    }
}