package caculator.opera;

import caculator.BaseOperation;

/**
 * @author pood1e
 */
public class OperationMul extends BaseOperation {
    @Override
    public double getResult(double a, double b) {
        return a * b;
    }
}
