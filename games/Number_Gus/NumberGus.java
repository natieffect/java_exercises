package games.Number_Gus;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class NumberGus {

    private static Scanner scan_Object = new Scanner(System.in);
    private static Random  random_object =  new Random();
    private static int max_range = 100;
    private static int min_range = 1;

    public static void main(String[] args) {
         welcome();
         start();

    }

    public static void  welcome() {
         System.out.println("\t !!!!!!!!! Welcome to number Gussing Game !!!!!!!!!");
         System.out.println("\t >>>>>>>>> Hope You Engoy the game >>>>>>>>>");
    }

    public static void start(){
         int user_input = getNumbers();

         if (user_input !=0) {
            boolean val_result = validatNumber(user_input);
            if (val_result) {
                 System.out.println("\t >>>>>>>>> Congradulation you have got Point <<<<<<<<<");
                 System.out.println("\t >>>>>>>>> you have gused the Wrong Number <<<<<<<<<");
            }
         } 


    }

    public static int getNumbers() {
        try {
             System.out.println("((())) Please Write number b/n 1 to 100: ((()))");
             int user_input = scan_Object.nextInt();

             return user_input;
            
        } catch (InputMismatchException e) {
            // TODO: handle exception
             System.err.println("\t !!!!!!!! Please write correct form of input !!!!!!!!!");
             return 0;
        }        
    }

    public static boolean validatNumber(int user_input) {
         // get the random number
         int random_value = random_object.nextInt(max_range-min_range+1)+min_range;

         // validate input values

         if (user_input == random_value) {
             return true;
         } else {
            
            return false;
         }
    }
}
