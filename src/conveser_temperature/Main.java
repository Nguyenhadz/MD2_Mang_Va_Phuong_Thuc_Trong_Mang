package conveser_temperature;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        System.out.println("What do you do:");
        System.out.println("1. Celsius to Fahrenheit.");
        System.out.println("2. Fahrenheit to Celsius.");
        System.out.println("3. Exit");
        System.out.println("your choice:");
        choice = scanner.nextInt();
        switch (choice) {
            case 3:
                System.out.println("M Ranh Qua");
                System.exit(0);
            case 1:
                System.out.println("Input your Celsius:");
                celsius = scanner.nextDouble();
                System.out.println("Fahrenheit = "+ celsiusToFahrenheit(celsius));
                break;
            case 2:
                System.out.println("Input your Fahrenheit:");
                fahrenheit = scanner.nextDouble();
                System.out.println("Celsius = "+ fahrenheitToCelsius(fahrenheit));
                break;
            default:
                System.out.println("Tinh lai di");
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5) * celsius +32;
        return fahrenheit;
    }
    public  static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32)*5/9.0;
        return celsius;
    }
}
