package Week1;
class Box7 {
    double weight;
    double height;
    double depth;

    Box7(double w, double h, double d) // 3 argument constructor
    {
        weight = w;
        height = h;
        depth = d;
    }

    double volume() {
        return weight * height * depth;
        // double result = width * height * depth;
        // return result;
    }
} //class end
public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 box1 = new Box7(2, 3,4);
        double volume = box1.volume();
        System.out.printf("volume is %10.2f ",volume);
        //Box7 box2 = new Box7(3,4,8);



    }
}