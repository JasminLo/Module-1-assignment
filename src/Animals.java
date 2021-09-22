public class Animals {
    private String name;
    private int x;
    private int y;

    // Constructor:
    public Animals(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    // getter and setter fot attributes;
    // name:
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // x:
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    // y:
    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    // getInfo method for name and position, it prints out the name, the x and y of the animal
    public void getInfo() {
        System.out.println(this.getName() + " position is (" + this.getX() + " , " + this.getY() + ")");
    }

    // movementAndPrintInfo method, it moves the animals by the given amount and then prints out the position
    public void movementAndPrintInfo(int dX, int dY) {
        this.x -= dX;
        this.y -= dY;
        System.out.println(this.getName() + " moved to (" + this.getX() + " , " + this.getY() + ")");
    }

    // gameOver Method, it prints out the snake line and the game over
    public void gameOver(){
        System.out.println("snake: I'm eating you ah ah!!");
        System.out.println(" ");
        System.out.println("    ***********");
        System.out.println("     GAME OVER ");
        System.out.println("    ***********");
        System.exit(0);
    }

    // maercySentence Method, it prints out the rabbit's mercy phrase
    public void mercySentence(){
        System.out.println("rabbit: No pleaaaaase, don't eat me!!");
    }

}