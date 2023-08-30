import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      //  String texto = "Hola mundo, estoy aprendiendo python Aunque tambien me gusta  mucho go";
        String texto = "";
        texto= sc.nextLine();

        String regex = ("java|python|go|pascal|perl+");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while (matcher.find()) {
            System.out.println("Se encontró la frase '" + matcher.group()
                    + "' en el índice " + matcher.start());
        }
    }
}
