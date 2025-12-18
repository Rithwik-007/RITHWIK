package lab2;

import java.util.Scanner;

class Box {

    double length, width, height;

    // Method to calculate volume
    double volume() {
        return length * width * height;
    }
}

public class DemoBox {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box b = new Box();

        System.out.print("Enter length: ");
        b.length = sc.nextDouble();

        System.out.print("Enter width: ");
        b.width = sc.nextDouble();

        System.out.print("Enter height: ");
        b.height = sc.nextDouble();

        double vol = b.volume();

        System.out.println("Volume of the box = " + vol);

        sc.close();
    }
}

