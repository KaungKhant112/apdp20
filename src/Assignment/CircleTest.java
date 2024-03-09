package Assignment;

import java.util.Scanner;

public class CircleTest {
    double radius;

    public CircleTest(double radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter circle radius");
        double radius= sc.nextDouble();
        CircleTest circle= new CircleTest(radius);
        double area = circle.calculateArea();
        System.out.println("Circle Area: "+area);
    }
}
