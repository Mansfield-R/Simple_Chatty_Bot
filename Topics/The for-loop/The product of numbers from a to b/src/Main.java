import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Scanner for input:
        Scanner scanner = new Scanner(System.in);

        // Variables:
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long totalProduct = 1;

        // Loop:
        for (long i = a; i < b; ++i) {
            totalProduct *= i;
        }

        // Show result:
        System.out.println(Math.abs(totalProduct)); // Used Math to grab absolute value in case negative numbers

    }
}
