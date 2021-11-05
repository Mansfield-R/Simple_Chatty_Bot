import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int givenNumber = scanner.nextInt();

        int hundreds = givenNumber / 100;
        int remaining = givenNumber - 100 * hundreds;
        int dec = remaining / 10;

        int reversedNumber = 100 * remaining + 10 * dec + hundreds;
        System.out.println(reversedNumber);
    }
}