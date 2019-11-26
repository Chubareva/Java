import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Введите предложение: ");
        String str = s.nextLine();
        System.out.println(task(str));


    }
    public static String task(String text){
        String[] words = text.split("[,;:.!?\\s]+");
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        return text.substring(0, text.indexOf(firstWord)) + lastWord + text.substring(text.indexOf(firstWord) + firstWord.length(), text.lastIndexOf(lastWord)) + firstWord + text.substring(text.lastIndexOf(lastWord) + lastWord.length());
    }
}
