import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Hello space cadet, what is your name?");
         String name = scanner.nextLine();

         System.out.println("Excellent, nice to meet you " + name + ".");
         Random rand = new Random();

         int number = rand.nextInt(100);
         System.out.println("You shouldn't know this yet but the random number is " + number);
         System.out.println("Okay, I'm thinking of a number between 1 and 100. What do you think it is?");

         int guess = -1;
         int numGuesses = 0;
         guess = scanner.nextInt();

         while (guess != number) {
             numGuesses ++;
             if (guess < 1 || guess > 100){
                 System.out.println("Wow " + name + " I thought you were someone who knew how to read instructions. Guess something BETWEEN 1 AND 100 PLZ.");
                 guess = scanner.nextInt();
             }
             else if(guess > number){
                 System.out.println("That's too high. Guess again.");
                 guess = scanner.nextInt();
             }
             else {
                 System.out.println("Nope, too low. Try again.");
                 guess = scanner.nextInt();
             };
         }
         numGuesses ++;
         System.out.println("You got it! And it only took you " + numGuesses + " tries!");
         scanner.close();
     }
 }