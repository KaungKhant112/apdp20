package Week5;

import Week4.A;

public class C extends A {
    final float PI=3.14179f;
    public void test()
    {
        A aa=new A();
        //aa.getRemainder(3 ,2);      private class in other class A
        //aa.divide(3,2);
        C cc=new C();
        cc.multiply(3,2);
        aa.add(3,2);

       // PI=785;
    }
}
