import java.util.Scanner;

public class Problem20DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        long decimal = scanner.nextLong();
        System.out.println("Hexadecimal number is: " + Long.toHexString(decimal).toUpperCase());
        scanner.close();
    }
}
