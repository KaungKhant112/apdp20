package Week2;

public class FarenToCelcius {
    public float farentToCelcius(float fahren)
    {
        float centigrade=5/9.0f *( fahren -32.0f);
        return centigrade;
    }

    public static void main(String[] args) {
        FarenToCelcius farenToCelcius=new FarenToCelcius();
        System.out.println(farenToCelcius.farentToCelcius(98.6f));
        float centi=farenToCelcius.farentToCelcius(100.6f);
        System.out.println(centi);
    }

}
