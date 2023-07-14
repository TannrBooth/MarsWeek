import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
     public GuessingGame(Scanner sc) {
         System.out.println("Hello space cadet, what is your name?");
         String name = sc.nextLine();

         System.out.println("Excellent, nice to meet you " + name + ".");
         Random rand = new Random();

         int number = rand.nextInt(100);
         System.out.println("You shouldn't know this yet but the random number is " + number);
         System.out.println("Okay, I'm thinking of a number between 1 and 100. What do you think it is?");

         int guess = -1;
         int numGuesses = 0;
         guess = sc.nextInt();

         while (guess != number) {
             numGuesses ++;
             if (guess < 1 || guess > 100){
                 System.out.println("Wow " + name + " I thought you were someone who knew how to read instructions. Guess something BETWEEN 1 AND 100 PLZ.");
                 guess = sc.nextInt();
             }
             else if(guess > number){
                 System.out.println("That's too high. Guess again.");
                 guess = sc.nextInt();
             }
             else {
                 System.out.println("Nope, too low. Try again.");
                 guess = sc.nextInt();
             };
         }
         numGuesses ++;
         System.out.println("You got it! And it only took you " + numGuesses + " tries!");
     }
 }