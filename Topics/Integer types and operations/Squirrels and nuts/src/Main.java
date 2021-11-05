import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int sqr = scanner.nextInt();
        int nuts = scanner.nextInt();

        int remainingNuts = (nuts % sqr);
        System.out.println(remainingNuts);

    }
}