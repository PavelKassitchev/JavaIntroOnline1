import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_8_Loops {

    //The method gets a positive integer and returns the sum from 1 to this integer
    public static long sumUpTo(int n) {
        if(n <= 0) throw new IllegalArgumentException("Wrong argument");
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    //The method prints values of a function within a range from a to b with step h
    public static void findValues(double a, double b, double h) {
        double init = a;
        while(init <= b) {
            if(init > 2) System.out.println(init);
            else System.out.println(-init);
            init += h;
        }
    }

    //The method calculates Sum of Squares of the first 100 positive integers
    public static int sumOfSquares() {
        int sumOfSquares = 0;
        for(int i = 1; i <= 100; i++) {
            sumOfSquares += i*i;
        }
        return sumOfSquares;
    }

    //The method calculates Product of Squares of the first 200 positive integers
    public static BigInteger productOfSquares() {
        BigInteger productOfSquares = new BigInteger("1");
        for(int i = 1; i <= 200; i++) {
            productOfSquares = productOfSquares.multiply(BigInteger.valueOf(i*i));
        }
        return productOfSquares;
    }

    //The method finds a sum of a number sequence where elements are more or equal to a given value
    public static double sumSequence(double minElement) {
        int n = 0;
        double sum = 0;
        double element = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        while(element >= minElement) {
            sum += element;
            n++;
            element = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        }
        return sum;
    }

    //The methods prints a numerical representation of a character
    public static void printCharacterNumer(char c) {
        System.out.println("Numerical value of character " + c + " is " + (int)c);
    }

    //This method prints all dividers for numbers between start and end
    public static void printDividers() {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        if(start < 0 || end < 0 || start > end) throw new IllegalArgumentException("Input correct limits");
        for(int i = start; i <= end; i++) {
            System.out.print("Dividers of " + i + ": ");
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //This method gets two integers and returns common figures of them
    public static Set<Character> findCommonFigures(int a, int b) {
        Set<Character> common = new HashSet<>();
        char[] first = String.valueOf(a).toCharArray();
        char[] second = String.valueOf(b).toCharArray();
        for(char c: first) {
            for(char ch: second) {
                if(c == ch) {
                    common.add(c);
                    break;
                }
            }
        }
        return common;
    }


    //Checking the methods above
    public static void main(String[] args) {
        System.out.println(sumUpTo(100));
        findValues(1.0, 3, 0.1);
        System.out.println(sumOfSquares());
        System.out.println(productOfSquares());
        System.out.println(sumSequence(0.5));
        printCharacterNumer(' ');
        printDividers();
        System.out.println(findCommonFigures(12343070, 333270).toString());
    }
}
