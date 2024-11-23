import java.util.Scanner;

public class E5_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose mode (strict/lenient): ");
        String mode = scanner.nextLine().toLowerCase();

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        boolean increasing = false;
        boolean decreasing = false;

        if (mode.equals("strict")) {
            // Strict mode
            increasing = (num1 < num2) && (num2 < num3);
            decreasing = (num1 > num2) && (num2 > num3);
        } else if (mode.equals("lenient")) {
            // Lenient mode
            increasing = (num1 <= num2) && (num2 <= num3);
            decreasing = (num1 >= num2) && (num2 >= num3);
        } else {
            System.out.println("Invalid mode. Please choose 'strict' or 'lenient'.");
            scanner.close();
            return;
        }

        if (increasing) {
            System.out.println("increasing");
        } else if (decreasing) {
            System.out.println("decreasing");
        } else {
            System.out.println("neither");
        }

        scanner.close();
    }
}
