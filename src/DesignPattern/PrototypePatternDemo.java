package DesignPattern;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache.loadCache();;
        Shape shape=ShapeCache.getShape("1");
        shape.draw();
        Shape shape1=ShapeCache.getShape("2");
        shape1.draw();
        shape1 = ShapeCache.getShape("3");
        shape1.draw();
    }
}
