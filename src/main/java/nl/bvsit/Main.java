package nl.bvsit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Read any integer
        System.out.println(ConsoleReader.read());
        //Read integer in range
        System.out.println(ConsoleReader.read(1,5));
    }
}
