package reader;

/**
 * @author pood1e
 */
public class ProxyImage implements Image {

    private RealImage image;
    private final String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (image == null){
            image = new RealImage(name);
        }
        image.display();
    }
}
