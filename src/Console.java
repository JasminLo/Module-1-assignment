public class Console {
    public static void main(String[] args) {

        // Snake and Rabbit objects are created with starting position
        Animal snake = new Animal("Snake", 10, 10);
        Animal rabbit = new Animal("Rabbit", 1,1);

        // Game:
        // getInfo is used to print out the start position
        rabbit.getInfo();
        // translate changes the Animal object's x and y position with dx and dy variables
        rabbit.translate(1,1);

        snake.getInfo();
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        // if the difference between the snake's position and rabbit's position x,y is = 1 then the rabbit asks for mercy
        if(snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1 ){
            System.out.println("rabbit: Nooooo Please don't eat me!!");
        }

        snake.translate(-1,-1);

        // if the snake's and rabbit's position are the same, the rabbit is eaten
        if(rabbit.getX() == snake.getX()  && rabbit.getY() == snake.getY()){
            System.out.println("Ahhrrrrrr im eating you ha ha!");
            System.out.println(" ");
            System.out.println("***********");
            System.out.println(" GAME OVER");
            System.out.println("***********");
        }

    }
}