package Week5;

public class MyCalculation extends Calculation{
    public void multiplication(int a, int b)
    {
        z=a*b;
        System.out.println("multiplication result is "+z);
    }

    public static void main(String[] args) {
        MyCalculation myCalculation=new MyCalculation();
        int a=20;
        int b=5;
        myCalculation.addition(a,b);
        myCalculation.subtraction(a,b);
        myCalculation.multiplication(a,b);
    }
}
