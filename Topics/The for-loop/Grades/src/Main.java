import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;


        for (int i = 0; i < input; i++) {

            int gradeInput = scan.nextInt();

            if (gradeInput == 2) {
                counterD += 1;
            }
            if (gradeInput == 3) {
                counterC += 1;
            }
            if (gradeInput == 4) {
                counterB += 1;
            }
            if (gradeInput == 5) {
                counterA += 1;
            }
            gradeInput = 0;
        }

        System.out.println(counterD + " " + counterC + " " + counterB + " " + counterA);
    }
}
