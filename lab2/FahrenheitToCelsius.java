import java.util.Scanner;

public class FahrenheitToCelsius {

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter degree in Fahrenheit : ");
        String input = sc.nextLine();
            String regex = "^(?:(?:\\d\\d\\.|[\\-.]))?\\d\\d$";
            if (input.matches(regex)) {
                double fahrenheit = Double.parseDouble(input);
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
            } else {
                System.out.println("Your input is not valid");
            }
        System.out.println("Goodbye!");
        sc.close();
    }
}
