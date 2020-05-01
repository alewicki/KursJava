import java.util.Scanner;

public class Lekcja4 {
    public static void main(String[] args) {

    }


    //Print season based on given month
    //"Spring": March  to May
    //"Summer": June  to August
    //"Autumn": September to November
    //"Winter": December to February
    //In case of incorrect month print: "Incorrect month"
    //Correct months:
    //January
    //February
    //March
    //April
    //May
    //June
    //July
    //August
    //September
    //October
    //November
    //December
    static void getSeason(int month) {

    }

    //    Program should convert money in PLN to foreign currencies (USD,GBP,EUR,CHF)
    //    Assume following currency rate:
    //    USD->PLN 4.19
    //    GBP->PLN 5.18
    //    EUR->PLN 4.54
    //    CHF->PLN 4.31
    //    In case of unknown currency program should throw IllegalArgumentException with following message "Error! Following currency: {currency} is not available"
    //    Tip: how to throw an exception: throw new IllegalArgumentException("Error msg");
    public static double calculate(double amountInPLN, String currency) {
        return 0;
    }

    //Based on given grade return grade description
    //1-bad
    //2-not good
    //3-ok
    //4-good
    //5-excellent
    //in case of incorrect grade return null
    public static String returnGrade(int grade) {

        return null;
    }

    //Using switch statement and Scanner class implement quiz. User should enter one of following answers: a,b,c or d after every question
    //In case of correct answer print "Correct!" and increment variable score;
    //In case of incorrect answer  print "Incorrect!" and DO NOT increment variable 'score';
    //In case of or answer different then a,b,c,d print "Answer not available!" and DO NOT increment variable 'score';
    //After quiz call method returnGrade() with 'score' parameter
    //Tip: to increment int variable use ++ operator. For example i++ will increment variable i by 1.
    // int i =0;
    // i++        <<< now value of i is 1
    // i++        <<< now value of i is 2
    public static void startQuiz() {
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        //Question 1
        System.out.println("Which primitive types represents integral numbers?");
        System.out.println("a. int,float,short,long");
        System.out.println("b. int,short,byte,double");
        System.out.println("c. int,byte,short,long");
        System.out.println("d. float,long,short,byte");
        System.out.println();
        System.out.println("Enter your choice: ");

        String answer1 = scanner.next();

        //here add switch

        //Question 2
        System.out.println("Assuming x is int variable, how to correctly write 'if' statement?");
        System.out.println("a. if(1) {}");
        System.out.println("b. if(x=1) {}");
        System.out.println("c. if(x==true) {}");
        System.out.println("d. if(x==1) {}");
        System.out.println();
        System.out.println("Enter your choice: ");


        //Question 3
        System.out.println("Number 15 in binary system is:");
        System.out.println("a. 1010");
        System.out.println("b. 1111");
        System.out.println("c. 1001");
        System.out.println("d. 10000");
        System.out.println();
        System.out.println("Enter your choice: ");


        //Question 4
        System.out.println("String is not:");
        System.out.println("a. an object");
        System.out.println("b. representing text type");
        System.out.println("c. a primitive type");
        System.out.println("d. all answers are correct");
        System.out.println();
        System.out.println("Enter your choice: ");


        //Question 5
        System.out.println("What is the size of double type in Java?");
        System.out.println("a. 8 bit");
        System.out.println("b. 16 bit");
        System.out.println("c  32 bit");
        System.out.println("d. 64 bit");
        System.out.println();
        System.out.println("Enter your choice: ");


    }


    //print numbers from 1 to 10 inclusive
    public static void printNumbers() {

    }

    //return sum of numbers from 1 to 50
    public static int sumNumbers() {
        return 0;
    }


    //In a loop ask user for 5 integers input.
    //Sum all integers provided by user and print "Sum of integers is: {sum}"
    //Tip: Use scanner.nextInt() method to get int type. Care! It may throw an exception in case of non integer input.
    public static void sum5NumbersFromKeyboard() {

    }


}
