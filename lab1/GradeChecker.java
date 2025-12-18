package lab1;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = sc.nextInt();
        char grade;

        if (mark >= 90 && mark <= 100) {
            grade = 'O';
        } else if (mark >= 80) {
            grade = 'E';
        } else if (mark >= 70) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else {
            grade = 'F'; // F for fail (optional)
        }

        System.out.println("Grade: " + grade);

        sc.close();
    }
}
