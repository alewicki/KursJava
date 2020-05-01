import java.util.Objects;
import java.util.Scanner;

public class Lekcja5 {
    public static void main(String[] args) {

    }


    //print numbers from 1 to 10 inclusive
    public static void printNumbers() {


    }

    //return sum of numbers from 1 to 50 inclusive
    public static int sumNumbers() {
        return 0;
    }

    //In a loop ask user for 5 integers input.
    //Sum all integers provided by user and print "Sum of integers is: {sum}"
    //Tip: Use scanner.nextInt() method to get int type. Care! It may throw an exception in case of non integer input.
    public static void sum5NumbersFromKeyboard() {

    }

    //In a loop ask user for integers input.
    //Sum all integers provided by user till he input "stop" keyword
    //Tip: Use Integer.valueOf() method to cast String to int. Care! It may throw an exception in case of wrong parameter (exception example: Integer.valueOf("one"))
    //Tip2: To leave loop in any time use break keyword
    public static void sumAllNumbersFromKeyboard() {

    }


    //Method should return factorial of n
    //example 5!=1*2*3*4*5=120
    public static int returnFactorial(int n) {
        return 0;
    }

    //0,1,1,2,3,5,8,13
    //Fibonacci sequence is a sequence each number is the sum of the two preceding ones starting with 0,1
    //example printFibonacciSequence(1) => 0
    //example printFibonacciSequence(2) => 1
    //example printFibonacciSequence(3) => 1
    //example printFibonacciSequence(8) => 13
    public static void printFibonacciSequence(int n) {

    }

    //Print all characters in String s in new line
    //example:
    //abcd ->
    //a
    //b
    //c
    //d
    //Tip1: use length() method to get size of string ("abc".length() will return 3)
    //Tip2: use charAt(int i) method to get N-th char of string ("abc".charAt(0) will return 'a')
    public static void printVertically(String s) {

    }


    //Palindrome is a sequence of characters which reads the same backward as forward
    //Return true if given String is palindrome, return false otherwise.
    //Palindrome examples:
    //civic
    //stats
    //level
    //radar
    //Tip use method .charAt(n) to get n character of String.
    //Example:
    //"abcd".charAt(0) => 'a'
    //"abcd".chartAt(3) => 'd'
    //"abcd".chartAt(4) => Exception will be thrown, because there is no character on index 4 in String "abcd"
    public static boolean isPalindrome(String s) {
        return false;
    }


    //return maximum integer of array
    //Example: {1,2,3,4} -> 4
    //Example: {-1,8,3,3} -> 8
    //Tip1: to initialize array:   int[] a = {1, 2, 3};
    //Tip2; to get N-th element of array a: int elementOfArray=a[0];
    //Tip3: arrays starts indexing from zero so int[] a = {10,2,18}; a[0] -> 10, a[1] -> 2, a[2] -> 18, a[3] -> Exception will be thrown
    public static int getMax(int[] array) {
        return 0;
    }


    //Print random integers from 1 to 6 till drawing a 6
    //Tip: To generate random integer use nextInt() method in class Random
    //Example:
    // Random random = new Random();
    // int randomInt=random.nextInt();  -- generate random integer
    //Tip 2: to set bound of integer generation use method nextInt(int bound)
    //Example:
    //int randomInt0to5 = random(nextInt(6)); -- generate random integer in range 0-5
    public static void printRandomTill6() {

    }

    //{"ab", "ba"}, {"cc"} -> {"ab", "ba", "cc"}
    public static String[] concat(String[] a, String[] b) {
        return null;
    }


}
