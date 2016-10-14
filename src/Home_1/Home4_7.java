package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int resalt = number1 / number2;
        int oststok = number1 % number2;

        if (oststok > 0) {
            System.out.println ("FALSE " + resalt + " остаток от деления = " + oststok);
        }else
            System.out.println ("TRUE " + resalt);
    }
}
