import java.util.Scanner;
import java.util.regex.Pattern;


public class Regex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();

       // String fileName = "ISI2022-2.csv";

        Pattern pattern = Pattern.compile("^ISI\\d{4}-\\d{1}\\.(txt|csv)$");

        boolean isMatch = pattern.matcher(fileName).matches();

        if (isMatch) {
            System.out.println("El nombre del archivo es válido.");
        } else {
            System.out.println("El nombre del archivo no es válido.");
        }
    }
}
