import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        // Variables needed
        int numberOfElements = scanner.nextInt();
        int sumOfElements = 0;

        // Loop and add each element found divisible by 6:
        for (int i = 0; i < numberOfElements; i++) {
            int givenElement = scanner.nextInt();
            if (givenElement % 6 == 0) {
                sumOfElements += givenElement;
            }
        }
        System.out.println(sumOfElements);
    }
}
