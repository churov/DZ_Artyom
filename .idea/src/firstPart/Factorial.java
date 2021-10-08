package firstPart;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        System.out.println("Введите значение положительного целого числа, факториал которого необходимо узнать:");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }

        System.out.println("Факториал числа " + f + " = " + result);
    }
}