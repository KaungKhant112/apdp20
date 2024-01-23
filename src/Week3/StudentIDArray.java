package Week3;

import java.util.Scanner;

public class StudentIDArray {
    public void Search(String id)
    {
        String [] ids = {"111111111", "111111112", "111111113", "111111114", "111111115"};
        String [] names = {"Thuta", "Kaung Khant", "Phoo Myat", "Nyan Myint", "Lin Thit"};
        double [] gpa = {2.0, 2.5, 3.0, 3.5, 4.0};
        boolean found = false;
        for(int i = 0; i<ids.length; i++)
        {
            if(id.equals(ids[i]))
            {
                System.out.println(ids[i]+" "+ names[i]+" "+gpa[i]);
                found = true;
                break;
            }

        }
        if (!found)
        {
            System.out.println("Not found");
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student id");
        String id=sc.nextLine();
        StudentIDArray SId=new StudentIDArray();
        SId.Search(id);


    }
}
