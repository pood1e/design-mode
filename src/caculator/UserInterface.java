package caculator;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numA = sc.nextDouble();
        String op = sc.next();
        double numB = sc.nextDouble();
        BaseOperation operation = OperationFactory.createOperation(op);
        double res = operation.getResult(numA, numB);
        System.out.println(numA + op + numB + "=" + res);
    }
}
