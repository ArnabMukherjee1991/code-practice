package recursion;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

@Slf4j

public class RecursiveGCD {

    public static void main(String[] args) {
        //input from scanner
        System.out.println("Enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        log.info("GCD of " + a + " and " + b + " is " + gcd);
    }

    private static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
