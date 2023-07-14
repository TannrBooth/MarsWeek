import java.util.Scanner;
import java.util.Arrays;

public class MarsExpedition {
         public MarsExpedition(Scanner sc) throws InterruptedException {
             System.out.println("Booting up Expedition. Please stand by.");
             System.out.println("Bootup complete.");
             System.out.println("Please enter your name.");

             String name = sc.nextLine();

             System.out.println("Greetings " + name + ". Are you ready to embark on your expedition? Type Y or N");
             String embark = sc.nextLine();

             if (embark.equals("y") || embark.equals("Y")) {
                 System.out.println("Of course you are. You are the team leader. How silly of me to ask.");
             } else if (embark.equals("n") || embark.equals("N")) {
                 System.out.println("Sorry... bzzzt... couldn't hear you...bzzzt.... but I'm pretty sure you said yes.");
             }

             System.out.println("So, how many team members are you bringing?");
             String teamSizeInput = sc.nextLine();
             if (teamSizeInput.equals("2")) {
                 System.out.println("Perfect. Because we only have three seats anyway.");
             } else {
                 System.out.println("I'm not really sure why I asked you, we have to bring three of you anyway. So yeah, you should have said 2");
             }
             int teamSize = 2;

             System.out.println("What snack will you require for your voyage? You can only choose one.");
             String snack = sc.nextLine();
             System.out.println("Really? Ok. No judgement here, if that's what you want to take, you can have the " + snack + ".");

             String[] vehicles = {"A: Space Mustang", "B: Space PT Cruiser", "C: Space triple-unicycle", "D: SpaceX"};
             System.out.println("Now please choose your vehicle by typing the corresponding letter:");
             System.out.println(Arrays.toString(vehicles));
             String vehicle = "";
             while (vehicle.equals("")) {
                 String vehicleChoice = sc.nextLine();
                 switch (vehicleChoice) {
                     case "A" -> vehicle = "Space Mustang";
                     case "B" -> vehicle = "Space PT Cruiser";
                     case "C" -> vehicle = "Space triple-unicycle";
                     case "D" -> vehicle = "SpaceX";
                     default -> System.out.println("That's not an option. Please enter A-D");
                 }
             }
             System.out.println("Thanks for choosing the " + vehicle + ", I was hoping you'd say that.");
             System.out.println("Alrighty then. So you are " + name + ". You are bringing " + teamSize + " companions. You're snacking on " + snack + "and you'll be driving the " + vehicle + ". Bon voyage!");
         }
 }