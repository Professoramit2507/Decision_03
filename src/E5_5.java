import java.util.Scanner;

public class E5_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        int length = word.length();

        if (length > 1) {
            String firstHalf = word.substring(0, length / 2);
            String secondHalf = word.substring((length + 1) / 2); // Skip middle letter if odd

            if (firstHalf.equals(secondHalf)) {
                System.out.println("first and second half same");
            } else {
                System.out.println("first and second half different");
            }
        } else {
            System.out.println("Word too short to compare halves.");
        }

        scanner.close();
    }
}
