public class Rectangle {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculateArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Rectangle r1= new Rectangle(4,10);
        int ans=r1.calculateArea();
        System.out.println("Rectangle area: "+ans);
    }
}
