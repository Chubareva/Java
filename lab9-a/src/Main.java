
//Найти в строке наибольшее число цифр, идущих подряд.
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<String>();

        try {
            BufferedReader in = new BufferedReader(new FileReader("C:/Users/Inga/java/lab9-a/in.txt"));
            String line = null;
            while ((line = in.readLine()) != null) {
                lines.add(line);
            }
        }
        catch (Exception exc) {}

        String stringWithMostDigits="";
        Pattern digitPattern = Pattern.compile("\\d+");

        for(String string:lines) {
            Matcher matcher = digitPattern.matcher(string);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                if (stringWithMostDigits.length() < string.substring(start, end).length())
                    stringWithMostDigits = string.substring(start, end);
            }
        }

        System.out.println("Наибольшое число цифр идущих подряд :" + stringWithMostDigits);

    }
}

