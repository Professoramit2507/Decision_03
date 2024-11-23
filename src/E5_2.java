import java.util.Scanner;

public class E5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a floating-point number: ");
        double number = scanner.nextDouble();

        if (number == 0) {
            System.out.println("zero");
        } else {
            String size = "";
            if (Math.abs(number) < 1) {
                size = "small ";
            } else if (Math.abs(number) > 1_000_000) {
                size = "large ";
            }

            if (number > 0) {
                System.out.println(size + "positive");
            } else {
                System.out.println(size + "negative");
            }
        }

        scanner.close();
    }
}
