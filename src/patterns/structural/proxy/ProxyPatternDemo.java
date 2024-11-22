package patterns.structural.proxy;

public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        Image image2 = new ProxyImage("test.png");

        image.display();
        System.out.println("");
        image2.display();

        image.display();
    }
}
