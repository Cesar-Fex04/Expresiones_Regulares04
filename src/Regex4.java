
import java.util.Scanner;
import java.util.regex.Pattern;
public class Regex4 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            //String email = "jdoe@unison.mx";
            Pattern pattern = Pattern.compile("^([a-z0-9_.\\-]+)@(unison\\.mx|uson\\.mx)$");
            boolean isMatch = pattern.matcher(email).matches();
            if (isMatch) {
                System.out.println("El correo electrónico es válido.");
            } else {
                System.out.println("El correo electrónico no es válido.");
            }
        }
    }

