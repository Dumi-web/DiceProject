import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DiceTest {
    // tests negative probabilities in Number array.
    Die die5 = new Die(5,0,0,0,0,0);
    @Test
    void NegativeProbabilities(){
        assertThrows(Exception.class, ()-> die5.roll());
    }
    // tests probabilities sum must be greater than or equal to 1.
    Die die6 = new Die(6,0,0,0,0,0,0);
    @Test
    void probabilitySum(){
        assertThrows(Exception.class, ()-> die6.roll());
    }
    //tests dice sides has to be an integer that is greater than 1.
    Die die1 = new Die(1,1,1,1,1,1,1);
    @Test
    void SidesGreaterThanOne(){
        assertThrows(Exception.class, ()-> die1.roll());
    }
    //tests only integer values allowed.
    Die die2 = new Die(2,1.2,1);
    @Test
    void OnlyIntegerValues (){
        assertThrows(Exception.class, ()-> die2.roll());
    }
    }



