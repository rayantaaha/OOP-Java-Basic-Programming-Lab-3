import java.util.Scanner;

public class Problem23BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binary = scanner.nextLine().trim();
        long decimal = Long.parseLong(binary, 2);
        System.out.println("HexaDecimal value: " + Long.toHexString(decimal).toUpperCase());
        scanner.close();
    }
}
