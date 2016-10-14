package Home_1;

import java.util.Scanner;

/**
 * Created by Nastya on 14.10.2016.
 */
public class Home4_1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите время ");
        int time = sc.nextInt();

        if (time >= 9 && time <= 18){
            System.out.println("Я на роботе");
        }
        else if (time > 0 && time < 9 || time > 18 && time <= 24) {
            System.out.println("Я отдыхаю");
        }
        else
            System.out.println("ERROR!");
    }
}
