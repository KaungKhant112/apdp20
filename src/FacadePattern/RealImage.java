package FacadePattern;

public class RealImage implements Image{
    String filename;
    public RealImage(String filename)
    {
        this.filename=filename;
    }
    @Override
    public void display() {
        System.out.println("displaying "+filename);
    }
    private void loadFromDisk(String filename)
    {
        System.out.println("Load from disk"+filename);
    }
}
