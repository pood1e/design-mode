package caculator.opera;

import caculator.BaseOperation;

public class OperationAdd extends BaseOperation {
    @Override
    public double getResult(double a, double b) {
        return a + b;
    }
}
