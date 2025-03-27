package Quiz;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int money, counter = 0;
        int totalMoney = 0, totalMoneyEarned = 0;
        int firstFruit = -1, secondFruit = -1, thirdFruit = -1;
        String continuity;

        do {
            while (true) {
                try {
                    System.out.print("Enter the amount of money you want: ");
                    money = input.nextInt();
                    if (money > 0) break;
                    System.out.println("Error: Please enter a positive amount!");
                } catch (InputMismatchException e) {
                    System.out.println("Error: Please enter a valid number!");
                    input.next();
                }
            }

            totalMoney += money;

            while (counter <= 2) {
                int fruits = rnd.nextInt(6);

                switch(fruits) {
                    case 0:
                        System.out.println("Cilek");
                        break;
                    case 1:
                        System.out.println("Portakal");
                        break;
                    case 2:
                        System.out.println("Elma");
                        break;
                    case 3:
                        System.out.println("Muz");
                        break;
                    case 4:
                        System.out.println("Kiraz");
                        break;
                    default:
                        System.out.println("Kavun");
                }

                if (counter == 0)
                    firstFruit = fruits;
                else if (counter == 1)
                    secondFruit = fruits;
                else
                    thirdFruit = fruits;
                counter ++;
            }
            if ((firstFruit == secondFruit) && (secondFruit == thirdFruit)) {
                System.out.println("Amount of money earned in this round: " + (money * 3 - money));
                money *= 3;
            }
            else if ((firstFruit == secondFruit) || (firstFruit == thirdFruit) || (secondFruit == thirdFruit)) {
                System.out.println("Amount of money earned in this round: " + (money * 2 - money));
                money *= 2;
            }
            else {
                System.out.println("Amount of money earned in this round: " + 0);
                money = 0;
            }
            totalMoneyEarned += money;


            System.out.print("Do you want to play again ? (If you want, press y or Y) ");
            continuity = input.next();
            counter = 0;
        } while (continuity.equalsIgnoreCase("y"));

        System.out.println("Total amount of money: " + totalMoney);
        System.out.println("Total money earned: " + totalMoneyEarned);
        System.out.println("Income: " + (totalMoneyEarned - totalMoney));

        input.close();
    }
}
