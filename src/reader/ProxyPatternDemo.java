package reader;

/**
 * @author pood1e
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        Image image = new ProxyImage("mm.jpg");
        image.display();

        image.display();
    }

}
