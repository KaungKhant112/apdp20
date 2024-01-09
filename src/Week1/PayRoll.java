package Week1;

public class PayRoll {
    float payRate; //camel case
    float workHour;
    PayRoll(float pr,float wh)// 2 arguments constructure
    {
        payRate = pr;
        workHour = wh;

    }

    public void displayGrossPayandNetPay()
    {
        float grossPay=payRate*workHour;
        float netPay=grossPay- (grossPay*0.15f);
        System.out.printf("  Gross Pay is %20.2f \n net pay is %20.2f",grossPay, netPay);
    }

    public static void main(String[] args) {
        PayRoll payRoll=new PayRoll(20,8); //create PayRoll object
        payRoll.displayGrossPayandNetPay();
    }
}
