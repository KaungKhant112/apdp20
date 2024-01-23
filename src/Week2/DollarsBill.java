package Week2;

import java.util.Scanner;

public class DollarsBill {
    public void billnote(int dollars)
    {
        int twentys=(dollars)/20;
        int after20s=(dollars)%20;
        int tens=(after20s)/10;
        int after10s=(after20s)%10;
        int fives=(after10s)/5;
        int ones=after10s%5;
        System.out.printf("twentys %4d\n tens %4d\n  fives %4d\n  ones %4d", twentys, tens,fives, ones );
    }

    public static void main(String[] args) {
        new DollarsBill().billnote(90);




    }
}
