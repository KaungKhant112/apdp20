package Week1;

class Box4 {
    double width;
    double height;
    double depth;

    double volume()
    {
        return width*height*depth;
    }

    void setDim(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;

    }
}
public class BoxDemo4 {

    public static void main(String[] args) {
        Box4 box41=new Box4();
        Box4 box42=new Box4();

        box41.width=3;
        box41.height=2;
        box41.depth=4;

        box42.width=5;
        box42.height=4;
        box42.depth=3;

        double vol=box41.volume();
        System.out.println("box 41 volume: "+vol);

        vol=box42.volume();
        System.out.println("box21 volume:"+vol);




        //testing setDim method with parameters
        Box4 box43=new Box4();
        box43.setDim(10,23,5);
        vol =box43.volume();
        System.out.println("box43 volume: "+vol);



    }

}
