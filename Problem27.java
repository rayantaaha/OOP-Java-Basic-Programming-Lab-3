import java.util.Scanner;

public class Problem27OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an octal number: ");
        String octal = scanner.nextLine().trim();
        long decimal = Long.parseLong(octal, 8);
        System.out.println("Equivalent hexadecimal number: " + Long.toHexString(decimal).toUpperCase());
        scanner.close();
    }
}
