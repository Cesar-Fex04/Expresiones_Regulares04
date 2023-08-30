import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String regex = args[0];
        String input = args[1];

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        boolean isMatch = matcher.matches();

        if (isMatch) {
            System.out.println("La expresión es válida.");
        } else {
            System.out.println("La expresión no es válida.");
        }
    }
}
