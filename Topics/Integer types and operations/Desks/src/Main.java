import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables Needed:
        int classRoom1 = scanner.nextInt();
        int classRoom2 = scanner.nextInt();
        int classRoom3 = scanner.nextInt();
        // Math
        int totalDesksNeeded = (((classRoom1 % 2) + (classRoom1 / 2))
                + ((classRoom2 % 2) + (classRoom2 / 2))
                + ((classRoom3 % 2) + (classRoom3 / 2)));

        // Display
        System.out.println(totalDesksNeeded);
    }
}