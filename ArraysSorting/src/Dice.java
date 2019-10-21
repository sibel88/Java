public class Dice {
    private int faces;

    public Dice() {
        this.faces = 6;
    }

    public Dice(int faces) {
        this.faces = faces;
    }

    public int getFaces() {
        return faces;
    }

    public int rollDice() {
        int result;
        double random = Math.random() * (this.faces) + 1;
        result = (int) random;
        return result;
    }
}
