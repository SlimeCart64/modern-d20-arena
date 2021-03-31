import java.util.ArrayList;

public class DiceTray {

    ArrayList<Die> dice = new ArrayList<>();

    public DiceTray(ArrayList<Die> dice) {
        this.dice = dice;
    }

    public DiceTray(int numberOfDice, Die cloneable) {
        for (int i = 0; i < numberOfDice; i++) {
            dice.add(cloneable);
        }
    }

    public int rollSum(int modifier) {
        return sum(roll()) + modifier;
    }

    public int rollSum() {
        return sum(roll());
    }

    public int sum(int[] items) {
        int output = 0;
        for (int i = 0; i < dice.size(); i++) {
            output += items[i];
        }
        return output;
    }

    public int[] roll() {
        int[] output = new int[dice.size()];
        for (int i = 0; i < dice.size(); i++) {
            output[i] = dice.get(i).roll();
        }
        return output;
    }
}
