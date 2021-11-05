import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Variables:
        int totalParts = scanner.nextInt();
        int perfectParts = 0;
        int fixedParts = 0;
        int rejectedParts = 0;

        // Loop to count parts and do math:
        for (int i = 0; i < totalParts; i++) {
            int part = scanner.nextInt();
            if (part == 0) {
                perfectParts += 1;
            }
            if (part < 0) {
                rejectedParts += 1;
            }
            if (part > 0) {
                fixedParts += 1;
            }
        }

        System.out.println(perfectParts + " " + fixedParts + " " + rejectedParts);

    }
}
