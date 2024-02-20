package Week4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A {

    public void openFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    protected void multiply(float a, float b)
    {
        System.out.println(a*b);
    }

    void divide(int a, int b)
    {
        System.out.println(a/b);
    }

    private void getRemainder(int a, int b)
    {
        System.out.println(a% b);
    }
    public void test()
    {
        A aa=new A();
        aa.getRemainder(3 ,2);      //private class in other class A
        aa.divide(3,2);
        aa.multiply(3,2);
        aa.add(3,2);
    }




}
