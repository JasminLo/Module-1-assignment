import java.awt.*;

public class console
{
    public static void main(String[] args) {
        Animal rabbit = new Animal("Rabbit", 1, 1);
        Animal snake = new Animal("Snake", 10, 10);

        System.out.println("I am the" + rabbit.getName() + ", I am standing on square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + snake.getName() + ", I am standing on square" + snake.toString());
        snake.translate(-1,-1);

        System.out.println("I am the" + rabbit.getName() + ", I moved to square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + snake.getName() + ", I moved to square" + snake.toString());
        snake.translate(-1,-1);

        System.out.println("I am the" + rabbit.getName() + ", I moved to square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + snake.getName() + ", I moved to square" + snake.toString());
        snake.translate(-1,-1);

        System.out.println("I am the" + rabbit.getName() + ", I moved to square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + rabbit.getName() + ", I moved to square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + snake.getName() + ", I moved to square" + snake.toString());
        snake.translate(-1,-1);

        System.out.println("I am the" + rabbit.getName() + ", I moved to square" + rabbit.toString());
        rabbit.translate(1,1);

        System.out.println("I am the" + rabbit.getName() + "Please don't eat me");

        System.out.println("I am the" + snake.getName() + ", I moved to square" + snake.toString());
        snake.translate(-1,-1);

        System.out.println("I am the" + snake.getName() + "I am eating you, Muhahahah");
    }
    }

