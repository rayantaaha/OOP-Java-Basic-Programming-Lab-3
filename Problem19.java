import java.util.Scanner;

public class Problem19DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        long decimal = scanner.nextLong();
        System.out.println("Binary number is: " + Long.toBinaryString(decimal));
        scanner.close();
    }
}
