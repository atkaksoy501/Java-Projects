package java;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Which calculation do you want to do? (+, -, *, /, %): ");
        String calcMethod = scan.nextLine();
        if (calcMethod.equals("+")) {
            sum();
        }
        if (calcMethod.equals("-")) {
            subtract();
        }
        if (calcMethod.equals("*")) {
            multiply();
        }
        if (calcMethod.equals("/")) {
            divide();
        }
        if (calcMethod.equals("%")) {
            mod();
        }

    }
    public static void sum() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.print("How many numbers do you want to sum?: ");
        int sumNum = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= sumNum; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println("The result is " + sum);
    }

    public static void subtract() {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        System.out.print("How many numbers do you want to subtract?: ");
        int subNum = scan.nextInt();
        for (int i = 1; i <= subNum; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = scan.nextInt();
            if (num < 0) {
                res += num;
            }
            else {
                res -= num;
            }

        }
        System.out.println("The result is " + res);
    }

    public static void multiply() {
        Scanner scan = new Scanner(System.in);
        int res = 0;
        System.out.println("Enter the first number: ");
        int first = scan.nextInt();
        System.out.println("Enter the second number: ");
        int sec = scan.nextInt();
        res = first*sec;
        System.out.println("The result is " + res);
    }

    public static void divide() {
        Scanner scan = new Scanner(System.in);
        double res = 0;

        System.out.println("Enter the first number: ");
        double first = scan.nextInt();
        System.out.println("Enter the second number: ");
        double sec = scan.nextInt();
        res = first/sec;
        System.out.println("The result is " + res);
    }

    public static void mod() {
        Scanner scan = new Scanner(System.in);
        int res = 0;


        System.out.println("Enter the number that you want to calculate it's mod: ");
        int num = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the mod: ");
        int mNum = scan.nextInt();
        res = num % mNum;

        System.out.println("The result is " + res);
    }
}
