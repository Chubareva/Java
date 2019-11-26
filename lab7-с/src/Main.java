import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder str = new StringBuilder("hel2owo4rld");
        System.out.println(str);
        for (int i = 1; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int countLetters = Character.getNumericValue(str.charAt(i));
                str.setCharAt(i, str.charAt(i - 1));
                for (int j = i; j - i < countLetters - 2; j++) {
                    str.insert(j, str.charAt(i - 1));
                }
            }
        }
        System.out.println(str);
    }
}