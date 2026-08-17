import java.util.Scanner;

public class Problem21DecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        long decimal = scanner.nextLong();
        System.out.println("Octal number is: " + Long.toOctalString(decimal));
        scanner.close();
    }
}
