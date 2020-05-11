package caculator;

import caculator.opera.OperationAdd;
import caculator.opera.OperationDiv;
import caculator.opera.OperationMul;
import caculator.opera.OperationSub;

/**
 * @author pood1e
 */
public class OperationFactory {

    public static BaseOperation createOperation(String operator){
        BaseOperation oper = null;

        switch (operator){
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
            default:
                break;
        }

        return oper;
    }

}
