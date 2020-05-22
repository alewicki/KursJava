package lekcja10;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        final Calculator calculator = new Calculator();
        try {
            calculator.divideFromCommandLine();
        } catch (InputMismatchException e) {
            System.out.println("Nie wprowadzono liczby!");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
            e.printStackTrace();
            throw e;
        } finally {
            System.out.println("Milego dnia!");
        }


        final FileManager fileManager = new FileManager();
        final String fileName = "xd.txt";

        try {
            fileManager.createFile(fileName);
        } catch (FileCreationException e) {
            System.err.println("File creation exception!");
            e.printStackTrace();
        }
        fileManager.writeToFile(fileName, "wtf");
        final String s = fileManager.readFile(fileName);
        System.out.println(s);


    }
}
