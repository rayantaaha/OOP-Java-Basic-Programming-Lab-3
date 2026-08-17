import java.util.Scanner;

public class Problem28HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = scanner.nextLine().trim();
        System.out.println("Equivalent decimal number is: " + Long.parseLong(hexadecimal, 16));
        scanner.close();
    }
}
