import java.util.Scanner;

public class E5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (less than 10 billion): ");
        long number = scanner.nextLong();

        if (number < 0) {
            number = -number; // Convert to positive
        }

        if (number == 0) {
            System.out.println("The number has 1 digit.");
        } else {
            int digits = 0;
            while (number > 0) {
                number /= 10;
                digits++;
            }
            System.out.println("The number has " + digits + " digits.");
        }

        scanner.close();
    }
}
