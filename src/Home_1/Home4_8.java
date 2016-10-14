package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int delimost2 = number1 % 2;
        int delimost_2 = number2 % 2;

        int delimost3 = number1 % 3;
        int delimost_3 = number2 % 3;

        int delimost4 = number1 % 4;
        int delimost_4 = number2 % 4;

        int delimost5 = number1 % 5;
        int delimost_5 = number2 % 5;

        int delimost6 = number1 % 6;
        int delimost_6 = number2 % 6;

        int delimost8 = number1 % 8;
        int delimost_8 = number2 % 8;

        int delimost10 = number1 % 10;
        int delimost_10 = number2 % 10;

        if (delimost2 == delimost_2){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost3 == delimost_3){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost4 == delimost_4){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost5 == delimost_5){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost6 == delimost_6){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost8 == delimost_8){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");

        if (delimost10 == delimost_10){
            System.out.println ("Числа равны");
        }else
            System.out.println ("Числа не равны");
    }
}
