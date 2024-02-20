package Week5;

import com.sun.security.jgss.GSSUtil;

public class SubClass extends SuperClass{
    int num=99;
    public void display()
    {
        System.out.println(" displaying sub class method");
    }

    public void my_method()
    {
        SubClass sub=new SubClass();
        System.out.println("Variable num in sub class "+sub.num);
        sub.display();
        System.out.println("Variable num in super class "+super.num);
        super.display();
    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.my_method();

    }
}
