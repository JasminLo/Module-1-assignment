public class Animal {

    // Attributes
    private String name;
    private int x;
    private int y;

    // Constructor
    public Animal (String name, int x, int y){
        this.setName(name);
        this.setX(x);
        this.setY(y);
    }

    // Sets location
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }

    // Shifts point by given amount
    public void translate(int dx, int dy){
        setLocation(x + dx, y + dy);
    }

    // Returns a string representation of points
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
