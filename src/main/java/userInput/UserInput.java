package userInput;

import java.util.Scanner;

public class UserInput {

    Scanner userInput = new Scanner(System.in);

   public String input(){
       String input = userInput.next();
       return input;
   }



}