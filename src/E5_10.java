import java.util.Scanner;
import java.util.HashMap;

public class E5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        // Count occurrences of each number using a HashMap
        HashMap<Integer, Integer> counts = new HashMap<>();
        counts.put(num1, counts.getOrDefault(num1, 0) + 1);
        counts.put(num2, counts.getOrDefault(num2, 0) + 1);
        counts.put(num3, counts.getOrDefault(num3, 0) + 1);
        counts.put(num4, counts.getOrDefault(num4, 0) + 1);

        // Check if we have exactly two pairs
        if (counts.size() == 2 && counts.containsValue(2)) {
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }

        scanner.close();
    }
}
