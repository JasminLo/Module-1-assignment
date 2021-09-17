import java.awt.*;

// Change Point to an X and a Y
public class Animal {
    private String name;
    private Point position;

    // Constructor
    public Animal (String name, Point position){
        this.setName(name);
        this.setPosition(position);
    }

    // Getters and Setters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPosition(Point position){
        this.position = position;
    }

    public Point getPosition(){
        return this.position;
    }

    // Extra methods
    public void translate(int x, int y, boolean gameOver){
        if (!gameOver) {
            this.position.x = this.position.x + x;
            this.position.y = this.position.y + y;
            System.out.println("I am the " + this.name + " and I moved to (" + this.position.x + ", " +
                    this.position.y + ")");
        }
    }

    public void printPosition(){
        System.out.println("I am the " + this.name + " and I am at (" + this.position.x + ", " +
                this.position.y + ")");
    }
}