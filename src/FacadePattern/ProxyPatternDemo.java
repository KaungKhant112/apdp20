package FacadePattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image=new ProxyImage("aa001.jpg");
        System.out.println("first time image display");
        image.display();
        System.out.println("Second time image display");
        image.display();

    }
}
