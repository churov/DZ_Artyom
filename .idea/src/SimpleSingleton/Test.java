package SimpleSingleton;

public class Test {
    public static void main(String[] args) {

        MySingleton.INSTANCE.printName();

        System.out.println(MySingleton.INSTANCE.getClass());
    }
}