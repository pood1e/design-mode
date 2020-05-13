package shape;

/**
 * @author pood1e
 */
public class RedBorderDecorator extends BaseShapeDecorator {
    public RedBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape) {
        System.out.println("red border decorated");
    }
}
