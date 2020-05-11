package cashier.concrete;

import cashier.Strategy;

/**
 * @author pood1e
 */
public class PrimaryStrategy implements Strategy {
    @Override
    public double calcPrice(double price) {
        return price * 0.9;
    }
}
