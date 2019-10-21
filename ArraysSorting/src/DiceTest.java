public class DiceTest {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        //System.out.println(myDice.getFaces());
        System.out.println(myDice.rollDice());
        Dice myDice2 = new Dice();
        System.out.println(myDice2.rollDice());
        Dice myCustomDice = new Dice(20);
        System.out.println(myCustomDice.rollDice());

    }
}
