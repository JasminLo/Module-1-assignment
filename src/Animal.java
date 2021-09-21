public class Animal {

    // Attributes for Animal class:
    private String name;
    private int x;
    private int y;

    // Constructor:
    public Animal (String name, int x, int y){
        this.setName(name);
        this.setX(x);
        this.setY(y);
    }

    // Method for setting location:
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Method for shifting point by given amount:
    public void translate(int dx, int dy){
        setLocation(x + dx, y + dy);
        System.out.println("The " + this.name + " moved to (" + this.getX() + ", " + this.getY() + ")");
    }

    // Method for returning a string representation of points:
    public String printPosition() {
        return "(" + x + ", " + y + ")";
    }

    // Setters:
    public void setName(String name) {
        this.name = name;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Getters:
    public String getName() {
        return name;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // Method for printing the current position:
    public void getInfo() {
        System.out.println("I am the " + this.getName() + ", I am standing on square " + this.printPosition());
    }
}