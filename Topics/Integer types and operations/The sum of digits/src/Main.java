import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberGiven = scanner.nextInt();
        int firstDigit = (numberGiven / 1) % 10;
        int secondDigit = (numberGiven / 10) % 10;
        int thirdDigit = (numberGiven / 100) % 10;

        System.out.println(firstDigit + secondDigit + thirdDigit);
    }
}
