package behavioraldesignPattern;

public class NameRepository implements Container{
    String[] names={"Sandi","MyoMyo","Zaw Zaw", "Ko Ko ", "Wai Yan"};
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
}
