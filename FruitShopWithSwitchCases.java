package PbJavaNovember.src.ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitShopWithSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double sum = 0.00;
        if (day.equals("Monday")
                || day.equals("Tuesday")
                || day.equals("Wednesday")
                || day.equals("Thursday")
                || day.equals("Friday")) {
            switch (fruit) {
                case "banana":
                    sum = 2.50 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "apple":
                    sum = 1.20 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "orange":
                    sum = 0.85 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "grapefruit":
                    sum = 1.45 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "kiwi":
                    sum = 2.70 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "pineapple":
                    sum = 5.50 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                case "grapes":
                    sum = 3.85 * quantity;
                    System.out.printf("%.02f", sum);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday")
                || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                sum = 2.70 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("apple")) {
                sum = 1.25 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("orange")) {
                sum = 0.90 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("grapefruit")) {
                sum = 1.60 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("kiwi")) {
                sum = 3.00 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("pineapple")) {
                sum = 5.60 * quantity;
                System.out.printf("%.02f", sum);
            } else if (fruit.equals("grapes")) {
                sum = 4.20 * quantity;
                System.out.printf("%.02f", sum);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
