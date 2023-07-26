import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateEmail {

    public static boolean validateEmails(String email) {
        // เช็คตัวอักษรต้องไม่ขึ้นต้นด้วย "." หรือ "@"
        if (email.startsWith(".") || email.startsWith("@")) {
            return false;
        }

        // เช็คตัวอักษรต้องไม่ขึ้นต้นด้วย "www"
        if (email.startsWith("www")) {
            return false;
        }

        // เช็คตัวอักษรที่อนุญาตให้ใช้ในอีเมล
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9@.\\-_]+$");
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            return false;
        }

        // เช็ครูปแบบที่ถูกต้องของอีเมล
        pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your email address:");
        String email = scanner.nextLine();

        if (validateEmails(email)) {
            System.out.println(email + " is a valid email");
        } else {
            System.out.println(email + " is not a valid email");
        }

        scanner.close();
    }
}
