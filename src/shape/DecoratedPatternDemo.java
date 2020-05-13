package shape;

/**
 * @author pood1e
 */
public class DecoratedPatternDemo {

    public static void main(String[] args) {

        Shape baseCircle = new Circle();
        BaseShapeDecorator decorator = new RedBorderDecorator(baseCircle);

        System.out.println("no decorator");
        baseCircle.draw();

        System.out.println("decorated shape");
        decorator.draw();

    }

}
