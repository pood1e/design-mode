package cashier;

import cashier.concrete.AdvancedStrategy;

import java.util.Scanner;

/**
 * @author pood1e
 */
public class UserInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double unitPrice = sc.nextDouble();
        int number = sc.nextInt();
        int discount = sc.nextInt();
        System.out.println("" + unitPrice + " " + number + " " + discount);

        Strategy strategy = new AdvancedStrategy();
        Context context = new Context(strategy);
        double res = context.quote(unitPrice * number);
        System.out.println(res);
    }

}
