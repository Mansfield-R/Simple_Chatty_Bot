import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Variables Needed:
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        // We set the initializer equal to first number:
        for (int i = a; i <= b; i++) {
            sum += i;
        }

        // Show our result:
        System.out.println(sum);
    }
}
