/*
 * Created by iyasuwatts on 10/17/17.
 */

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        /* write a program which prompts the user to ip their name
        the program should greet names Alice and Bob */
        //use control flow, cond, user ip, obj inst/dec, method invok
        
        System.out.println("What is your name? ");
        
        Scanner in = new Scanner(System.in);
        String firstName = in.next();

        if (firstName.equals("Alice") || firstName.equals("Bob"))
        {
            System.out.println("Nice to meet you!");
        } else {
            return;
        }

        
    }
}
