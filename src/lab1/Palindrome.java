package lab1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0, digit;

        while (temp != 0) {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        if (num == rev) {
            System.out.println(num + " is a Palindrome number");
        } else {
            System.out.println(num + " is not a Palindrome number");
        }

        sc.close();
    }
}
