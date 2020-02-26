public class DiceFactory extends Die {
    static int sides;

    public DiceFactory(int numSides, Number... prob) {
        super(numSides, prob);
    }
// this function returns a new Die.
    public static Die makeDie(int Numsides) {
     sides = Numsides;
        return new Die(sides);
    }
}
