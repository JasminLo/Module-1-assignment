public class Console {
    public static void main(String[] args) {
        Animal snake = new Animal("Snake", 9, 9);
        Animal rabbit = new Animal("Rabbit", 2,2);

        System.out.println("I am the " + rabbit.getName() + ", I am now standing on square " + rabbit.toString());

        rabbit.translate(1,1);

        System.out.println("I am the " + snake.getName() + ", I am now standing on square " + snake.toString());

        snake.translate(-1,-1);

        System.out.println("I am the " + rabbit.getName() + ", I am now standing on square " + rabbit.toString());

        rabbit.translate(1,1);

        System.out.println("I am the " + snake.getName() + ", I am now standing on square " + snake.toString());

        snake.translate(-1,-1);

        System.out.println("I am the " + rabbit.getName() + ", I am now standing on square " + rabbit.toString());

        rabbit.translate(1,1);

        System.out.println("I am the " + snake.getName() + ", I am now standing on square " + snake.toString());

        snake.translate(-1,-1);

        System.out.println("I am the " + rabbit.getName() + ", I am now standing on square " + rabbit.toString());

        rabbit.translate(1,1);

        System.out.println("I am the " + snake.getName() + ", I am now standing on square " + snake.toString());

        snake.translate(-1,-1);

        System.out.println("Nooooo Please don't eat me!!");

        System.out.println("I am the " + snake.getName() + ", I am now standing on square " + snake.toString());

        snake.translate(-1,-1);

        System.out.println("Ahhrrrrrr im eating you ha ha!");

    }
}