package lab2;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }

        System.out.println("Number of Even numbers: " + evenCount);
        System.out.println("Number of Odd numbers: " + oddCount);

        sc.close();
    }
}

