/*
Реализовать приложение-игру "Угадай число" с бесконечным циклом запрашивающая у пользователя числа
 и сравнивающая с загаданным алгоритмом числом, выдающее "Очень холодно", "Холодно", "Горячо", "Очень горячо",
  "Угадал". При ответе "Угадал" алгоритм закончит игру.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int x = rand.nextInt(9) + 1;

        int z = 0;
        for (int num = 0; ; ) {
            System.out.println("Введите число: ");
            int a = scan.nextInt();

            if (a != x) {
                if (num > 0) {
                    int y = z;
                    z = Math.abs(a - x);
                    if (y > z) {
                        System.out.println("Теплее!");
                    } else {
                        System.out.println("Холоднее!");
                    }
                }
                num++;
                z = Math.abs(a - x);
                System.out.println("Вы не угадали, попробуйте ёщё раз");


            } else if (a == x) {
                System.out.println("Угадал!");
                break;
            }
        }
    }
}
