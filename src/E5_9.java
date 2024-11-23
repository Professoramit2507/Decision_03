import java.util.Scanner;

public class E5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
            System.out.println("in order");
        } else {
            System.out.println("not in order");
        }

        scanner.close();
    }
}
