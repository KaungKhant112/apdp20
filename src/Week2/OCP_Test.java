package Week2;

public class OCP_Test {
    public static void main(String[] args) {
        Vehicle vehicle1=new Car(120,"Car");
        Vehicle v2=new Bus(100,"Bus");
        double carSpeed=vehicle1.calculateAllowedSpeed();
        double busSpeed=v2.calculateAllowedSpeed();
        System.out.println("Car speed is "+carSpeed);
        System.out.println("Bus speed is "+busSpeed);
        System.out.printf("Carspeed = %f \n Bus Speed = %f", carSpeed, busSpeed);
    }
}
