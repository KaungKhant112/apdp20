package FacadePattern;

public class ProxyImage implements Image {
    String filename;
    RealImage realImage;
    ProxyImage(String filename){
        this.filename=filename;
    }
    public void display()
    {
        if (realImage==null)
        {realImage= new RealImage(filename);}
        realImage.display();
    }

}
