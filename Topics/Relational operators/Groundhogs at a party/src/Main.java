import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int reesesCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (!isWeekend && (reesesCups >= 10 && reesesCups <= 20)) {
            System.out.println(true);
        } else if (isWeekend && (reesesCups >= 15 && reesesCups <= 25)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}