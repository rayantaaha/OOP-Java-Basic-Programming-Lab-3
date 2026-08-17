import java.util.Scanner;

public class Problem24BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Binary Number: ");
        String binary = scanner.nextLine().trim();
        long decimal = Long.parseLong(binary, 2);
        System.out.println("Octal number: " + Long.toOctalString(decimal));
        scanner.close();
    }
}
