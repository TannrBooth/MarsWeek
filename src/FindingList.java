import java.sql.SQLOutput;
import java.util.*;

public class FindingList {
    public FindingList(Scanner sc) throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back, space cadet! Now for the homework. Please catalog your findings.");

        ArrayList<String> rockList = new ArrayList<String>();

        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println("Rock List downloaded.");
        System.out.println(rockList);

        System.out.println("Hold up, one of these is not rock. Like it's literally called 'not rock'.");

        rockList.remove("not rock");
        System.out.println("Okay, I took care of that for you. Here's the updated list.");
        System.out.println(rockList);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();

        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil Data Downloaded.");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");
        String fossilChoice = sc.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossils.get(fossilChoice));
        }

        Thread.sleep(700);
        HashSet<String> specialSupplies = new HashSet<>();

        specialSupplies.add("Flux capacitor");
        specialSupplies.add("lightsaber");
        specialSupplies.add("sonic screwdriver");

        Iterator iterator = specialSupplies.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        specialSupplies.remove("sonic screwdriver");

        System.out.println("Removing sonic screwdriver. Updated list:");

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
