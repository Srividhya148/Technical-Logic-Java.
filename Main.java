import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Technical Utility Tool ---");
        System.out.println("1. Temperature Converter (C to F)");
        System.out.println("2. Even/Odd Logic Checker");
        System.out.println("3. Simple Interest Calculator");
        System.out.print("\nSelect an option: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            return;
        }

        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                System.out.println("Result: " + ((celsius * 9/5) + 32) + "°F");
                break;
            case 2:
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                System.out.println(num + (num % 2 == 0 ? " is Even." : " is Odd."));
                break;
            case 3:
                System.out.print("Enter Principal, Rate, and Time: ");
                double p = scanner.nextDouble();
                double r = scanner.nextDouble();
                double t = scanner.nextDouble();
                System.out.println("Simple Interest: " + (p * r * t) / 100);
                break;
            default:
                System.out.println("Invalid selection.");
        }
        scanner.close();
    }
}
