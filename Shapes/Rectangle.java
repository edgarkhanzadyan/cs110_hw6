package Shapes;

/**
 * Created by Edgar on 22.11.2016.
 */
public class Rectangle {
    private int width;
    private int height;
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public int getArea(){
        return width * height;
    }
}
