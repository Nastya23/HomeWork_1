package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        int a = sc.nextInt();

        int rezalt = a % 7;

        if (rezalt == 0) {
            System.out.println("Квадрат числа = " + a*a);
        }else
            System.out.println ("Остаток от деления = " + rezalt);
    }
}
