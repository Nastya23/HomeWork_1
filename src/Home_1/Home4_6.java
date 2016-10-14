package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int summ = number1 + number2;

        if (summ >= 11 && summ <= 19){
            System.out.println ("Сумма = " + summ);
        }else
            System.out.println ("ERROR!");
    }
}
