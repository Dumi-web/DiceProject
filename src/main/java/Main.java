
public class Main {
    public static void main(String[] args) throws Exception {
        Die die = new Die(5);
        die.roll();
        System.out.println(die.value);

        Die die5 = new Die(5, 1, 1, 1, 1, 1);
        die5.roll();
        System.out.println(die5.value);

        Die die6 = new Die(6,1,1,1,1,1,2);
        die6.roll();
        System.out.println(die6.value);

        Die die2 = new Die(2,1.2,1);
        die2.roll();
        System.out.println(die2.value);

        Die die20 = DiceFactory.makeDie(20);
        die20.roll();
        System.out.println(die20.value);
    }
}




