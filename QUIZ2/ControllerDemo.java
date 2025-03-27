package Quiz2;

import java.util.Scanner;

public class ControllerDemo {
    public ControllerDemo() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberController numberController = new NumberController();
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (numberController.searchBinary(number)) {
            System.out.println("The number is found.");
        } else {
            System.out.println("The number is not found.");
        }

        System.out.print("Enter an integer again: ");
        int number2 = input.nextInt();
        if (numberController.searchSequential(number2)) {
            System.out.println("The number is found.");
        } else {
            System.out.println("The number is not found.");
        }

    }
}