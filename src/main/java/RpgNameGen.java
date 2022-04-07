import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RpgNameGen {


    public static void main(String[] args) throws InterruptedException {

        Scanner userScanner = new Scanner(System.in);
        String newFullName;

        //Fresh terminal
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Hello wonderful user of RPG Name Generator!");
        System.out.println("\nSince you went to the trouble of finding this amazing game I suspect you think that your full name does not have an RPG 'ring' to it");
        System.out.println("\nIn RPG Name Generator I will therefore provide thee a name you are more worthy of...");

        System.out.println("Dear user state your real first name (only one name):");
        String userFirstName = userScanner.next();

        System.out.println("\nAre you sure.. are you seriously telling me your name is " + userFirstName + "?");
        System.out.println("[Y]es, give me my bloody RPG name");
        System.out.println("[N]o, please let me try again..");

        while (true) {
            String choice = userScanner.next();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("\nAlright.. alright.. no need to get nasty about it..");
                break;
            } else if (choice.equalsIgnoreCase("n")) {
                System.out.println("Having trouble remembering your name... Okey 'please' try again");
                break;
            } else {
                System.out.println("Please enter a valid choice, [y] or [n]");
            }
        }

        System.out.println("\n\nWait!! Before we go further.. do you think this is an amazing game?");
        System.out.println("Think carefully before you answer..");
        System.out.println("[Y]es or [N]o??");
        String userChoice = userScanner.next();


            if (userChoice.equalsIgnoreCase("y")) {
                newFullName = NewNameGood(userFirstName);
                System.out.println("\n\n\nI dub thee "+newFullName);
                TimeUnit.SECONDS.sleep(3);

            } else if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Dear user.. clearly you are ");
                newFullName = NewNameBad(userFirstName);
                System.out.println("\n\n\nI dub thee "+newFullName);
                TimeUnit.SECONDS.sleep(3);
            } else {
                System.out.println("Dear user.. I am not asking much of thee.. a simple yes or no.. I will give you a suiting name anyhow..");
                newFullName = NewNameDumb(userFirstName);
                System.out.println("\n\n\nI dub thee "+newFullName);
                TimeUnit.SECONDS.sleep(3);
            }


        System.out.println("\n\n\nThank you for playing");



    }


    public static String NewNameGood(String userFirstName) throws InterruptedException {

        Random rand = new Random();

        Countdown(userFirstName);

        List<String> goodExtensions = Arrays.asList("The Honest", "The Wizard", "Blood-Eater", "The Tremour Causing", "Sword Destroyer");
        //String[] goodExt = new String[]{"The Honest", "The Wizard", "Blood-Eater", "The Tremour Causing", "Sword Destroyer"};
        int randomFromList = rand.nextInt(goodExtensions.size());
        String randomExt = goodExtensions.get(randomFromList);
        String newFullName = userFirstName+" "+randomExt;

        return newFullName;
    }


    public static String NewNameBad(String userFirstName) throws InterruptedException {

        Random rand = new Random();

        Countdown(userFirstName);

        List<String> badExtensions = Arrays.asList("The Weak", "The Bed-Wetter", "The Runner", "The Scared");

        int randomFromList = rand.nextInt(badExtensions.size());
        String randomExt = badExtensions.get(randomFromList);
        String newFullName = userFirstName+" "+randomExt;

        return newFullName;
    }

    public static String NewNameDumb(String userFirstName) throws InterruptedException {

        Random rand = new Random();

        Countdown(userFirstName);

        List<String> dumbExtensions = Arrays.asList("The Slow", "The Reversed Mathematician", "The Not so Fast");

        int randomFromList = rand.nextInt(dumbExtensions.size());
        String randomExt = dumbExtensions.get(randomFromList);
        //Intentional error in row below should contain the randomly generated name extension as well
        String newFullName = userFirstName;

        return newFullName;

    }



    public static void Countdown(String userFirstName) throws InterruptedException {

        System.out.println("Thank you I will now ask the gods for a more proper name...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\n\nDear elders...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("If ye hear me...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Please provide this.." + userFirstName +" with a more proper name...\n");
        TimeUnit.SECONDS.sleep(3);

        System.out.print("Be..");
        TimeUnit.MILLISECONDS.sleep(300);
        System.out.print("Bop...");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.print("Beeee....");
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.print("Bop...");
        TimeUnit.MILLISECONDS.sleep(400);

    }

}

