import java.util.Scanner;

public class Problem18BinaryMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first binary number: ");
        String first = scanner.nextLine().trim();
        System.out.print("Input the second binary number: ");
        String second = scanner.nextLine().trim();

        long product = Long.parseLong(first, 2) * Long.parseLong(second, 2);
        System.out.println("Product of two binary numbers: " + Long.toBinaryString(product));
        scanner.close();
    }
}
