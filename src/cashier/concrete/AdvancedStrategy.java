package cashier.concrete;

import cashier.Strategy;

/**
 * @author pood1e
 */
public class AdvancedStrategy implements Strategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.8;
    }
}
