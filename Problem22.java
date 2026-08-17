import java.util.Scanner;

public class Problem22BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = scanner.nextLine().trim();
        System.out.println("Decimal Number: " + Long.parseLong(binary, 2));
        scanner.close();
    }
}
