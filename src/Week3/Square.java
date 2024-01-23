package Week3;

public class Square extends Quadrangle{
    float length;
    public Square(float l)
    {
        length=l;
    }

    @Override
    float area() {
        return length*length;
    }
}
