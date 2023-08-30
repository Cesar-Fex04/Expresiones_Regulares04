import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ragex1 {
    public static void main(String[] args) {
        String texto = "¡Hola mundo! Este es un ejemplo de cómo " +
                "buscar la frase exacta 'Hola mundo' en Java." +
                "Normalmente la frase Hola mundo es la primera al ser introducida a un codigo";
        String regex = "\\bHola mundo\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        while (matcher.find()) {
            System.out.println("Se encontró la frase '" + matcher.group()
                    + "' en el índice " + matcher.start());


        }
    }
}