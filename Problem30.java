import java.util.Scanner;

public class Problem30HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a hexadecimal number: ");
        String hexadecimal = scanner.nextLine().trim();
        long decimal = Long.parseLong(hexadecimal, 16);
        System.out.println("Equivalent of octal number is: " + Long.toOctalString(decimal));
        scanner.close();
    }
}
