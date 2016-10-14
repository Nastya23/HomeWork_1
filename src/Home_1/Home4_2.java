package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три числа");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Найбольшое число - " +number1);
        } else if (number2 > number1 && number2 > number3){
            System.out.println("Найбольшое число - " +number2);
        } else if (number3 > number2 && number3 > number1) {
            System.out.println("Найбольшое число - " + number2);
        }
        if (number1 < number2 && number1 < number3) {
            System.out.println("Найменшее число - " + number1);
        }else if (number2 < number1 && number2 < number3) {
            System.out.println("Найменшее число - " + number2);
        }else if (number3 < number2 && number3 < number1) {
            System.out.println("Найменшее число - " + number3);
        }
    }
}
