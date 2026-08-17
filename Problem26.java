import java.util.Scanner;

public class Problem26OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input any octal number: ");
        String octal = scanner.nextLine().trim();
        long decimal = Long.parseLong(octal, 8);
        System.out.println("Equivalent binary number: " + Long.toBinaryString(decimal));
        scanner.close();
    }
}
