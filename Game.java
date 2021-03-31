import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws InterruptedException {
        // Make a user input Scanner object
        Scanner in = new Scanner(System.in);

        // Making Die objects that will be used later
        Die d4 = new Die(4);
        Die d6 = new Die(6);
        Die d8 = new Die(8);
        Die d10 = new Die(10);
        Die d12 = new Die(12);
        Die d20 = new Die(20);

        // Making an empty ArrayList of dice to be used later
        ArrayList<Die> tempDice = new ArrayList<>();

        // Making ArrayLists of dice, then passing into DiceTray objects to be used later
        tempDice.add(d4);
        DiceTray tray1d4 = new DiceTray(tempDice);
        tempDice.clear();

        tempDice.add(d6);
        DiceTray tray1d6 = new DiceTray(tempDice);
        tempDice.clear();

        tempDice.add(d8);
        tempDice.add(d8);
        DiceTray tray2d8 = new DiceTray(tempDice);
        tempDice.clear();

        tempDice.add(d10);
        DiceTray tray1d10 = new DiceTray(tempDice);
        tempDice.clear();

        tempDice.add(d10);
        tempDice.add(d10);
        DiceTray tray2d10 = new DiceTray(tempDice);
        tempDice.clear();

        tempDice.add(d8);
        tempDice.add(d8);
        tempDice.add(d8);
        tempDice.add(d8);
        DiceTray tray4d8 = new DiceTray(tempDice);
        tempDice.clear();

        // Make the TriggerGroup objects used for the Firearm objects.
        TriggerGroup semiOnly = new TriggerGroup(true, false, false);

        // Making all the default available Firearm objects
        Firearm holdout = new Firearm("Holdout","Pistol", ".22 Long Rifle", 100, 12, 0.7, tray1d4, 25, 75, 550, semiOnly);
        Firearm backupPlan = new Firearm("Backup Plan", "Pistol", "10mm Auto", 50, 1, 1.0, tray1d10, 30, 90, 500, semiOnly);
        Firearm deserter = new Firearm("Deserter", "Pistol","9mm Parabellum", 250, 17, 0.9, tray1d4, 20, 60, 400, semiOnly);
        Firearm experimentBeta = new Firearm("Experiment Beta", "High-Powered Pistol",".357 Magnum", 550, 9, 1.1, tray2d8, 45, 135, 125, semiOnly);
        Firearm outlaw = new Firearm("Outlaw", "High-Powered Pistol", ".44 Magnum", 400, 6, 1.6, tray2d10, 55, 165, 90, semiOnly);
        Firearm experimentAlpha = new Firearm("Experiment Alpha", "High-Powered Pistol", ".50 Action Express", 850, 7, 1.1, tray4d8, 50, 150, 50, semiOnly);

        // Add descriptions to the Firearm objects.
        holdout.setDescription("A miniature little pistol that can be easily concealed. Fires a small cartridge with low damage and range, high firerate for its class, and a swift reload.");
        backupPlan.setDescription("A pistol made to overtake a single armed person to gain their weapon and regain control. Good damage, decent range, and ridiculously cheap, but don't miss your one shot.");
        deserter.setDescription("A handgun that gets its name from the desert camo included on every weapon. Fairly standard in most respects with slightly poorer range and a forgiving magazine size.");
        experimentBeta.setDescription("A semi-automatic handgun that was the first to take ammunition designed for revolvers. Very good damage, good range, but a higher price tag and a longer delay between shots.");
        outlaw.setDescription("A time-tested revolver that's as old as the hills. Significant power and range, but with a slow reload and only six rounds, you'd better kill what you shoot.");
        experimentAlpha.setDescription("A handgun that is so powerful it almost hurts to shoot. Absolutely impractical, but makes a statement. Extremely damaging, quite high range, but extremely expensive and with a really slow firerate.");

        // Print the main screen splash

        // Line 1
        Color.color("light gray");
        System.out.println("oo---------------------oo");

        // Line 2
        Color.color("light gray");
        System.out.print("o ");
        Color.color("blood");
        System.out.print("    &&&&&            ");
        Color.color("light gray");
        System.out.println(" o");

        // Line 3
        Color.color("light gray");
        System.out.print("|");
        Color.color("blood");
        System.out.print("    &&&  &&&           ");
        Color.color("light gray");
        System.out.println("|");

        // Line 4
        Color.color("light gray");
        System.out.print("|");
        Color.color("blood");
        System.out.print("     &&&&&&            ");
        Color.color("light gray");
        System.out.println("|");

        // Line 5
        Color.color("light gray");
        System.out.print("|");
        Color.color("blood");
        System.out.print("    &&  &&&&&          ");
        Color.color("light gray");
        System.out.println("|");

        // Line 6
        Color.color("light gray");
        System.out.print("|");
        Color.color("blood");
        System.out.print("     &&     &&& &&     ");
        Color.color("light gray");
        System.out.println("|");

        // Line 7
        Color.color("light gray");
        System.out.print("|");
        Color.color("blood");
        System.out.print("    &&&    &&&&&       ");
        Color.color("light gray");
        System.out.println("|");

        // Line 8
        Color.color("light gray");
        System.out.print("o ");
        Color.color("blood");
        System.out.print("    &&&&&&&&  &&     ");
        Color.color("light gray");
        System.out.println(" o");

        // Line 9
        System.out.println("oo---------------------oo");

        // Line 10 + 11
        Color.color("red");
        System.out.println("\nModern Warfare Arena ");

        // Prompt for a press of the ENTER key
        Color.color("reset");
        Thread.sleep(1000);
        System.out.print("\nHit ENTER to continue.");
        in.nextLine();

        // Display a message, then prompt to push ENTER again
        Color.color("diamond");
        System.out.println("Any text in this color is for player 1");
        Color.color("emerald");
        System.out.println("Any text in this color is for player 2");
        Color.color("reset");
        Thread.sleep(1000);
        System.out.print("\nHit ENTER to continue.");
        in.nextLine();

        // Ask for the name of Player 1
        Color.color("diamond");
        System.out.println("What is your name?");
        String name1 = in.nextLine();

        // Make a new Player using the name
        Player player1 = new Player(name1);

        // Game stats chooser
        String[] stats = {"str", "dex", "con", "int", "wis", "cha"};
        ArrayList<String> statsList = new ArrayList<>(Arrays.asList(stats).subList(0, 6));
        ArrayList<String> statsReordered = new ArrayList<>();

        System.out.println("Enter your highest score (random 16-18)");
        String current;
        boolean flag = false;
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 6; i++) {
                if (current.toLowerCase().equals(statsList.get(i))) {
                    statsList.remove(i);
                    statsReordered.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to first position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your second highest score (random 13-17)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 5; i++) {
                if (current.toLowerCase().equals(statsList.get(i))) {
                    statsList.remove(i);
                    statsReordered.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to second position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your third highest score (random 12-14)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 4; i++) {
                if (current.toLowerCase().equals(statsList.get(i))) {
                    statsList.remove(i);
                    statsReordered.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to third position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your third lowest score (random 11-13)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 3; i++) {
                if (current.toLowerCase().equals(statsList.get(i))) {
                    statsList.remove(i);
                    statsReordered.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to fourth position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your second lowest score (random 10-11)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 2; i++) {
                if (current.toLowerCase().equals(statsList.get(i))) {
                    statsList.remove(i);
                    statsReordered.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to fifth position.");
            } else {
                System.out.println("Invalid item!");
            }
        }

        current = statsList.get(0);
        statsReordered.add(current);
        System.out.println("Assigned " + current + " to remaining (sixth) position.");

        String[] finalArrayToPass = new String[6];
        for (int i = 0; i < 6; i++) {
            finalArrayToPass[i] = statsReordered.get(i);
        }

        player1.makeScores(finalArrayToPass, true);

        // Ask for the name of Player 2
        Color.color("emerald");
        System.out.println("What is your name?");
        String name2 = in.nextLine();

        // Make a new Player using the name
        Player player2 = new Player(name2);
        ArrayList<String> statsList2 = new ArrayList<>(Arrays.asList(stats).subList(0, 6));
        ArrayList<String> statsReordered2 = new ArrayList<>();

        // Game stats chooser
        statsList2.addAll(Arrays.asList(stats).subList(0, 6));

        System.out.println("Enter your highest score (random 16-18)");
        flag = false;
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 6; i++) {
                if (current.toLowerCase().equals(statsList2.get(i))) {
                    statsList2.remove(i);
                    statsReordered2.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to first position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your second highest score (random 13-17)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 5; i++) {
                if (current.toLowerCase().equals(statsList2.get(i))) {
                    statsList2.remove(i);
                    statsReordered2.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to second position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your third highest score (random 12-14)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 4; i++) {
                if (current.toLowerCase().equals(statsList2.get(i))) {
                    statsList2.remove(i);
                    statsReordered2.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to third position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your third lowest score (random 11-13)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 3; i++) {
                if (current.toLowerCase().equals(statsList2.get(i))) {
                    statsList2.remove(i);
                    statsReordered2.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to fourth position.");
            }
            else {
                System.out.println("Invalid item!");
            }
        }
        flag = false;

        System.out.println("Enter your second lowest score (random 10-11)");
        while (!flag) {
            current = in.nextLine();
            for (int i = 0; i < 2; i++) {
                if (current.toLowerCase().equals(statsList2.get(i))) {
                    statsList2.remove(i);
                    statsReordered2.add(current);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Assigned " + current + " to fifth position.");
            } else {
                System.out.println("Invalid item!");
            }
        }

        current = statsList2.get(0);
        statsReordered2.add(current);
        System.out.println("Assigned " + current + " to remaining (sixth) position.");

        String[] finalArrayToPass2 = new String[6];

        for (int i = 0; i < 6; i++) {
            finalArrayToPass2[i] = statsReordered2.get(i);
        }

        player2.makeScores(finalArrayToPass2, true);
    }
}
