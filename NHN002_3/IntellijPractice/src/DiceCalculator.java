public class DiceCalculator {
    public static int addDice(Dice first, Dice second) {
        return first.getNumber() + second.getNumber();
    }

    public static String getIndexOf(String str, int val) {
        return str.substring(0, val);
    }

    public static boolean odd(Dice dice) {
        return dice.getNumber() % 2 != 0;
    }
}
