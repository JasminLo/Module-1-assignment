public class Console {
    public static void main(String[] args) {

        // Creating the snake and rabbit object:
        Animals snake = new Animals("snake", 10, 10);
        Animals rabbit = new Animals("rabbit", 1, 1);


        // Game:
        snake.getInfo();
        rabbit.getInfo();

        // 1st movement

        snake.movementAndPrintInfo(1, 1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        rabbit.movementAndPrintInfo(-1, -1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        // 2nd movement

        snake.movementAndPrintInfo(1, 1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        rabbit.movementAndPrintInfo(-1, -1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        // 3rd movement

        snake.movementAndPrintInfo(1, 1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }


        rabbit.movementAndPrintInfo(-1, -1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        // 4th movement

        snake.movementAndPrintInfo(1, 1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        rabbit.movementAndPrintInfo(-1, -1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        // 5th movement

        snake.movementAndPrintInfo(1, 1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }

        rabbit.movementAndPrintInfo(-1, -1);

        // if/els if to check if the animals are on the same position or if they are in their surroundings  ( else if because i want 0 or 1 outputs from the if/else statement)
        if (snake.getX() - rabbit.getX() == 1 && snake.getY() - rabbit.getY() == 1) {
            rabbit.mercySentence();
        } else if (rabbit.getX() == snake.getX() && rabbit.getY() == snake.getY()) {
            snake.gameOver();
        }
    }
}