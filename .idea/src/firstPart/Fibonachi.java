package firstPart;

public class Fibonachi{
    public static int fib(int n) {
        if (n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Значение равно: " + fib(6));
    }
}
