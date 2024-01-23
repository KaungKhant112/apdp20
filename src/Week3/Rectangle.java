package Week3;

public class Rectangle extends Quadrangle {
    float width;
    float height;
    public Rectangle(float w,float h)
    {
        width=w;
        height=h;
    }
    @Override
    float area() {
        return width*height;
    }
}
