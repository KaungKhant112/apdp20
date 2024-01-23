package Week3;

public class LiskovTest {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(20,10);
        Square sq1=new Square(20);
        Rectangle r2=new Rectangle(15,30);
        Square sq2=new Square(30);
        //super type variable can store sub type objects
        Quadrangle[] quadrangles= {r1,sq1,r2,sq2};
    }
}
