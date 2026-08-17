import java.util.Scanner;

public class Problem17BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String first = scanner.nextLine().trim();
        System.out.print("Input second binary number: ");
        String second = scanner.nextLine().trim();

        long sum = Long.parseLong(first, 2) + Long.parseLong(second, 2);
        System.out.println("Sum of two binary numbers: " + Long.toBinaryString(sum));
        scanner.close();
    }
}
