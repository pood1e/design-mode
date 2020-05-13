package reader;

/**
 * @author pood1e
 */
public class RealImage implements Image {

    private final String name;

    public RealImage(String name) {
        this.name = name;
        loadFromDisk(name);
    }

    private void loadFromDisk(String name) {
        System.out.println("loading " + name);
    }

    @Override
    public void display() {
        System.out.println("displaying " + name);
    }
}
