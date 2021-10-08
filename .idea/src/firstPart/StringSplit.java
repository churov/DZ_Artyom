package firstPart;

public class StringSplit {
    public static void main(String[] args) {
        String str = "I want to become Java-automation tester";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
