import java.awt.*;

public class Animal {

        private String name;
        private int x;
        private int y;

        public Animal (String name, int x, int y)
        {
            this.setName(name);
            this.setX (x);
            this.setY (y);
        }

        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }

        public void setX(int x){
            this.x = x;
        }
        public int getX(){
            return this.x;
        }

        public void setY( int y){
        this.y = y;
    }
        public int getY(){
        return this.y;
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        setPoint(x + dx, y + dy);
    }

    public String toString() {return "(" + x + ", " + y + ")";}



    }