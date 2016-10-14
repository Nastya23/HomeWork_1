package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println ("Разница чисел = " + (number1 - number2));
        } else
            System.out.println ("Сумма чисел = " + (number1 + number2));
    }
}
