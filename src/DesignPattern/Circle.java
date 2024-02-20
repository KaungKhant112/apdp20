package DesignPattern;

public class Circle extends Shape{

    public Circle(){
        type="Circle";
    }
    @Override
    public void draw() {
        System.out.println("inside circle: draw method");

    }
}
