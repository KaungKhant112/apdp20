package Week1;

public class PayRoll {
    float payRate; //camel case
    float workHour;
    PayRoll(float pr,float wh)// 2 arguments constructure
    {
        payRate = pr;
        workHour = wh;

    }

    public float[] displayGrossPayandNetPay()
    {
        float[] pays=new float[2];
        //float grossPay=payRate*workHour;
        //float netPay=grossPay- (grossPay*0.15f);
        //return grossPay; // added return statement
        //System.out.printf("  Gross Pay is %20.2f \n net pay is %20.2f",grossPay, netPay);
        pays[0]=payRate*workHour;
        pays[1]= pays[0]- (pays[0]*0.15f);
        return pays;
    }

    public static void main(String[] args) {
        PayRoll payRoll=new PayRoll(20,8); //create PayRoll object
        payRoll.displayGrossPayandNetPay();
        float[] gpay=payRoll.displayGrossPayandNetPay();
       // System.out.println("return value grossPay in main  "+gpay);
        System.out.printf("return value grossPay %10.1f and netPay %10.1f ",gpay[0], gpay[1]);
    }
}
