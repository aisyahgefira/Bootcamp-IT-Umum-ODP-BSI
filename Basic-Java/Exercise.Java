//  Write a Java program that swaps the values of two integer variables without using a third variable.
public class Exercise {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        int a = 5;
        int b = 10;
        // Before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        //Using arithmetic operations
        a = a + b; // a = 15
        b = a - b; // b = 5
        a = a - b; // a = 10

        // After swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);


        System.out.println("Exercise 2");
        int a = 15;
        int b = 22;
        int c = 18;
        
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        // Display the result
        System.out.println("The largest number is " + largest);

    }
}
