package question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.nextLine().trim().charAt(0);
        char char2 = scanner.nextLine().trim().charAt(0);
        if (char1 < char2) {
            System.out.println(char1 + " " + char2);
        } else {
            System.out.println(char2 + " " + char1);
        }
        scanner.close();
    }
}
