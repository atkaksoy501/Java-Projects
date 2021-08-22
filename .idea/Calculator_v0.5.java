package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DortIslem dortIslem = new DortIslem();
        System.out.print("Enter the calculation method (+, -, *, /): ");
        String calcMethod = scan.nextLine();
        if (calcMethod.equals("+")) {
            System.out.print("Enter the first number: ");
            int s1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int s2 = scan.nextInt();
            System.out.println(dortIslem.Topla(s1,s2));
        }

        if (calcMethod.equals("-")) {
            System.out.print("Enter the first number: ");
            int s1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int s2 = scan.nextInt();
            System.out.println(dortIslem.Cikar(s1,s2));
        }
        if (calcMethod.equals("*")) {
            System.out.print("Enter the first number: ");
            int s1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int s2 = scan.nextInt();
            System.out.println(dortIslem.Carp(s1,s2));
        }
        if (calcMethod.equals("/")) {
            System.out.print("Enter the first number: ");
            int s1 = scan.nextInt();
            System.out.print("Enter the second number: ");
            int s2 = scan.nextInt();
            System.out.println(dortIslem.Bol(s1,s2));
        }

    }
}
