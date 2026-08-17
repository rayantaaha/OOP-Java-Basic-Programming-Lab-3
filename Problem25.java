import java.util.Scanner;

public class Problem25OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octal = scanner.nextLine().trim();
        System.out.println("Equivalent decimal number: " + Long.parseLong(octal, 8));
        scanner.close();
    }
}
