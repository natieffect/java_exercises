package games;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

/**
 * WordReverse
 */
public class WordReverse {
    private static final Scanner scanObj = new Scanner(System.in);

    public static void main(String[] args) {
     Greetings();
    }

    public static void Greetings(){
        System.out.println("\t !!!!!!!! Welcome to The Game !!!!!!!");
        System.out.println("\t  >>>>>>I hope that you have fun her<<<<<<<\n");
    }

    public static void start(){
    

    }

    public static String getUserInput(){
        System.out.println("Please write word here:\t");
        try {
             String usr_input =  scanObj.nextLine();
             char[] rev_input = new char[usr_input.length()];
             int j= usr_input.length();
             for (char c : usr_input.toCharArray()) {
                rev_input[j--] =  c;
             }
             String usr_str = new String(rev_input);
             return usr_str;
        } catch (Exception InputMismatchException) {
            // TODO: handle exception
            System.err.println(" !!!!!! Please write correct type input !!!!!");
            return null;
        }  
        
    }
}