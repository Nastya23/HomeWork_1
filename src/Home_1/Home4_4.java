package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число с плавающей точкой");
        double a = sc.nextInt();

        if (a > 0 && a < 1){
            System.out.println ("Точка " +a + "лежит в диапазоне от 0 до 1");
        }else
            System.out.println ("ERROR!");

    }
}
