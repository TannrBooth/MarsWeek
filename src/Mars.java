 public class Mars {
     public static void main(String[] args) throws InterruptedException {
         String colonyName = "Bronchia";
         int shipPopulation = 300;
         double meals = 4000.00;
         boolean landing = landingCheck(90);
         double landingMeals = .75;
         int daysLanding = 2;
         String landingLocation = "The Ocean";

         meals -= (daysLanding * (landingMeals * shipPopulation));
         System.out.println(meals);

         meals = meals*1.5;

         shipPopulation =+ 5;

         if(landingLocation.equals("The Plain")){
             System.out.println("Bbzzz Landing on the Plain");
         } else {
             System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
         }
     }
     public static boolean landingCheck(int minutesLeft) throws InterruptedException {
         for (int i = 0; i < minutesLeft; i++){
             if((minutesLeft % 6) == 0){
                 System.out.println("Keep Center");
             }
             else if ((minutesLeft % 3) == 0){
                 System.out.println("Left");
             }
             else if ((minutesLeft % 2) == 0) {
                 System.out.println("Right");
             }
             else {
                 System.out.println("Calculating");
             }
             Thread.sleep(250);
         }
         System.out.println("Landed");
         return false;
     }


 }