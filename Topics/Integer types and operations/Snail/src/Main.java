import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int pole = scanner.nextInt();
        int progress = scanner.nextInt();
        int regress = scanner.nextInt();

        int finishTime = (pole / ((progress + regress) - 1));
        System.out.println(finishTime);
    }
}
