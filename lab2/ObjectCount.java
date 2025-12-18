package lab2;

class Counter {

    static int count = 0;   // static variable

    Counter() {
        count++;            // increases when an object is created
    }
}

public class ObjectCount {
    public static void main(String[] args) {

        // Creating objects
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();
        Counter obj4 = new Counter();
        // Display the number of objects created
        System.out.println("Number of objects created = " + Counter.count);
    }
}

