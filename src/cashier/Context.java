package cashier;

/**
 * @author pood1e
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public double quote(double total) {
        return strategy.calcPrice(total);
    }
}
