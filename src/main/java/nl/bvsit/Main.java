package nl.bvsit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("a 7");
        System.out.println("Type integer:");
        //String input = scanner.next();

        int x=0;
        while (true){
            try{
                x = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e){
                System.out.println("Enter a whole number!");
                scanner.next();//Move read position past delimiter after last read token
            }
        }

        System.out.println(x);
        scanner.close();


    }
}
