package Week3;

public class Segregation {
    public static void main(String[] args) {
        Cube cube=new Cube(10);
        Circle circle=new Circle(5);
        double cubeArea=cube.area();
        double circleArea= circle.area();
        double cubeVolume=cube.volume();
        System.out.println(cubeVolume);
        System.out.println(cubeArea);
        System.out.println(circleArea);

    }
}
