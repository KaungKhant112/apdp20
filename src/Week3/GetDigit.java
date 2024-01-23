package Week3;

import java.util.Scanner;

public class GetDigit {
    public void checkDigit()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter digit");
        char c = sc.next().charAt(0);
        if (!Character.isDigit(c))
        {
            System.out.println("You entered not a digit");
        }
        else System.out.println("You entered a digit.");
    }

    public static void main(String[] args) {
        new GetDigit().checkDigit();
        //GetDigit gdigit=new GetDigit();
        //gdigit.checkDigit();
    }


}
