package shape;

/**
 * @author pood1e
 */
public abstract class BaseShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public BaseShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
