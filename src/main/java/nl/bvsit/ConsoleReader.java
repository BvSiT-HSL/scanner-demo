package nl.bvsit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {
    private static String PROMPT="Type a whole number:";
    private static String PROMPT_BETWEEN="Type a whole number between %d and %d" ;

/*    public static int read(){
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true){
            try{
                System.out.println(PROMPT);
                x = scanner.nextInt();
                break;
            }
            catch (InputMismatchException e){
                scanner.next();//Move read position past delimiter after last read token
            }
        }
        scanner.close();
        return x;
    }
*/

    public static int read(){
        return read(null,null);
    }

    public static int read(Integer  min,Integer max){
        boolean limitRange = (min!=null && max !=null);
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true){
            try{

                System.out.println(String.format(PROMPT_BETWEEN, min,max));
                x = scanner.nextInt();
                if (limitRange && (x<min || x > max) ) continue;
                break;
            }
            catch (InputMismatchException e){
                scanner.next();//Move read position past delimiter after last read token
            }
        }
        scanner.close();
        return x;
    }


}
