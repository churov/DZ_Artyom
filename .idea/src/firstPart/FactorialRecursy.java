package firstPart;

import java.util.Scanner;
public class FactorialRecursy {
    public static long fact(int i) {
        if ((i <= 1)) {
            return 1;
        }
        return i * fact(i - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите положительное целое число, факториал которого надо найти: ");
        int n = s.nextInt();
        System.out.print("Факториал числа " + n + " = " + fact(n));
    }
}
