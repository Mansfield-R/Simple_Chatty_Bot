import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        int out1 = --n1;
        int out2 = --n2;
        int out3 = --n3;
        int out4 = --n4;

        System.out.println(out1 + " " + out2 + " " + out3 + " " + out4);

    }
}