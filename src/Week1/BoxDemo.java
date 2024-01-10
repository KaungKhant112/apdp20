package Week1;

class Box{
    float width;//instance variable
    float height;
    float depth;
}//define the class Box

public class BoxDemo {
    public static void main(String[] args) {
        Box box=new Box();
        box.width=70;
        box.depth=50;
        box.height=20;
        float vol=box.depth*box.height*box.width;
        System.out.println("Volume of a box is "+vol);
    }

}
