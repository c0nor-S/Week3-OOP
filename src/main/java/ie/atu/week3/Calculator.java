package ie.atu.week3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //methods
        System.out.println("Please Enter Your First Number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int b = sc.nextInt();
        System.out.println("Please Enter An Operation: ");
        String op = sc.next();
        switch (op) {
            case "add": add(a, b); break;
            case "subtract": subtract(a, b); break;
            default: System.out.println("Invalid Operation"); break;


        }

    }
    public static void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("The Sum Is: " + sum);
    }

    public static void subtract(int a, int b)
    {
        int sum = a - b;
        System.out.println("The Result Is: " + sum);
    }
}
