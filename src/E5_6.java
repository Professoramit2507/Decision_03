import java.util.Scanner;

public class E5_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("all the same");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("all different");
        } else {
            System.out.println("neither");
        }

        scanner.close();
    }
}
