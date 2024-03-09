package week8DesignPattern;

public class DecaratorPatternDemo {
    public static void main(String[] args) {
        Shape circle= new Circle();
        Shape decoratedCircle= new RedShapeDecorator(new Circle());
        Shape decoratedRectangle= new RedShapeDecorator(new Rectangle());
        System.out.println("normal circle");
        circle.draw();
        System.out.println();

        System.out.println(" decorated circle ");
        decoratedCircle.draw();
        System.out.println();

        System.out.println("decorated rectangle");
        decoratedRectangle.draw();
        System.out.println();

        System.out.println("decorated Triangle");
        Shape decoratedTriangle=new RedShapeDecorator(new Triangle());
        decoratedTriangle.draw();


    }
}
