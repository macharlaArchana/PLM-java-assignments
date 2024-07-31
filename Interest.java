package StackAssignments;
public class Interest {
    public static double simpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public static double compoundInterest(double principal, double rate, int time, int n) {
        return principal * Math.pow((1 + rate / (n * 100)), n * time) - principal;
    }

    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5;
        int time = 2;

        System.out.println("Simple Interest: " + simpleInterest(principal, rate, time));
        System.out.println("Compound Interest: " + compoundInterest(principal, rate, time, 4)); // Quarterly compounding
    }
}
