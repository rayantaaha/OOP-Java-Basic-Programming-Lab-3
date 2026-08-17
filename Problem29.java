import java.util.Scanner;

public class Problem29HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Hexadecimal Number: ");
        String hexadecimal = scanner.nextLine().trim();
        long decimal = Long.parseLong(hexadecimal, 16);
        System.out.println("Equivalent Binary Number is: " + Long.toBinaryString(decimal));
        scanner.close();
    }
}
