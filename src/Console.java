public class Console {
    public static void main(String[] args) {

        // Snake and Rabbit objects are created:
        Animal snake = new Animal("Snake", 10, 10);
        Animal rabbit = new Animal("Rabbit", 1,1);

        // Game:
        rabbit.getInfo();
        rabbit.translate(1,1);

        snake.getInfo();
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        rabbit.translate(1,1);
        snake.translate(-1,-1);

        // if/else for danger zone:
        if(snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1 ){
            System.out.println("rabbit: Nooooo Please don't eat me!!");
        }

        snake.translate(-1,-1);

        // if/else kill zone :
        if(rabbit.getX() == snake.getX()  && rabbit.getY() == snake.getY()){
            System.out.println("Ahhrrrrrr im eating you ha ha!");
            System.out.println(" ");
            System.out.println("***********");
            System.out.println(" GAME OVER");
            System.out.println("***********");
        }

    }
}