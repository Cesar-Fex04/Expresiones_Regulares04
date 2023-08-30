import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String texto = "";
        texto= sc.nextLine();


        String regex = ("Hola mundo|Hola Mundo|HOLA MUNDO|hola mundo+");
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println("Se encontró la frase '" + matcher.group()
                    + "' en el índice " + matcher.start());

        }
    }
}
/*String text = "¡Hola mundo! Este es un ejemplo de cómo " +
                "buscar la frase exacta 'Hola Mundo' en Java." +
                "Normalmente la frase HOLA MUNDO es la primera al ser introducida a un codigo" +
                "de verdad, hola mundo fue la primer frase que yo programe en java";

         */