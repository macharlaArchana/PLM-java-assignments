package StackAssignments;
public class LcmHcf {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp; 
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static long factorial(int number) {
        if (number == 0) return 1;
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println("LCM of " + a + " and " + b + ": " + lcm(a, b));
        System.out.println("GCD of " + a + " and " + b + ": " + gcd(a, b));

        int number = 5;
        System.out.println(number + " is even: " + isEven(number));
        System.out.println(number + " is odd: " + isOdd(number));
        System.out.println("Factorial of " + number + ": " + factorial(number));
    }
}

