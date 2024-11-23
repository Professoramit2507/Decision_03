import java.util.Scanner;

public class E5_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (input.length() > 0) {
            char first = input.charAt(0);
            char last = input.charAt(input.length() - 1);

            if (first == last) {
                System.out.println("first and last letter same");
            } else {
                System.out.println("first and last letter different");
            }
        } else {
            System.out.println("Input is empty.");
        }

        scanner.close();
    }
}
