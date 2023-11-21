package games.Word_Reverse;

import java.util.Scanner;


/**
 * WordReverse
 */
public class WordReverse {
    private static final Scanner scanObj = new Scanner(System.in);

    public static void main(String[] args) {
     Greetings();
     start();
    }

    public static void Greetings(){
        System.out.println("\t !!!!!!!! Welcome to The Game !!!!!!!");
        System.out.println("\t  >>>>>>I hope that you have fun her<<<<<<<\n");
    }

    public static void start(){
        System.out.println("Final result:\t"+ getUserInput());
    }

    public static String getUserInput(){
        System.out.println("Please write word here:\t");
        try {
             String usr_input =  scanObj.nextLine();
             char[] input_rev = usr_input.toCharArray(); // chage string to character array value
             usr_input = "";
             for (int i = input_rev.length-1; i >=0; i--) {
                usr_input +=input_rev[i];
             }  
             return usr_input;
        } catch (Exception InputMismatchException) {
            // TODO: handle exception
            System.err.println(" !!!!!! Please write correct type input !!!!!");
            return null;
        }  
        
    }
}