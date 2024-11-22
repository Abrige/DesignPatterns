package patterns.structural.proxy;

public class RealImage implements Image{

    private RealImage realImage;

    private String fileName;
    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
