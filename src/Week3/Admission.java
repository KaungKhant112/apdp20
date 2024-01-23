package Week3;

import java.util.Scanner;

public class Admission {
    static double gpa;
    static int ts;
    public void Checking()
    {
        if(gpa>=3.6 && ts>=60  || gpa>=3.0 && ts>=70  || gpa>=2.6 && ts>=80  ||gpa>=2.0 && ts>=90   )
        {
            System.out.println("Accept");
        }
        else System.out.println("Reject");

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter GPA");
        gpa=sc.nextDouble();
        System.out.println("Enter test score");
        ts=sc.nextInt();
        new Admission().Checking();
    }
}
