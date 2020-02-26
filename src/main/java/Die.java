import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Die {
    public int value;
    public int sides;
    public Number[] probability;
// this is a construct of the class with parameters for sides and Number array.
    public Die(int numSides, Number... prob) {
        this.sides = numSides;
        this.value = 0;
        this.probability = prob.clone();
    }
// this function rolls the dies object and outputs a random value with rand.nextInt() built in function and stores it to the variable value.
    public void roll() throws Exception {
        int sum = 0;
        double rands =  Math.random();
        ArrayList<Double> outcome = new ArrayList<>();
        if(sides <= 1){
            throw new Exception("Error: sides has to be an integer that is greater than 1.");
        }
        if(probability.length != sides){
            Random rand = new Random();
            value = rand.nextInt((getSides())) + 1;
            return;
        }

        for (Number a : probability) {
            if (a.intValue() < 0) {
                throw new Exception("Error: negative probabilities not allowed.");
            }else if(a.intValue() >= 0){
                throw new Exception("only integer values allowed.");
            }
        }
        for (Number b:probability) {
            sum += b.intValue();
            }
        if (sum < 1) {
            throw new Exception("Error: probabilities sum must be greater than or equal to 1.");
        }
        if(Arrays.toString(probability).equals("[]")) {
            Random rand = new Random();
            value = rand.nextInt((getSides())) + 1;
        } else {
        for (int j = 0; j < probability.length; j++) {
            if (j > 0) {
                outcome.add(((double) probability[j]) / sum + outcome.get(j - 1));

            } else {
                outcome.add((double) probability[j] / sum);
            }
        }
        for (int i = 0; i < outcome.size(); i++) {
            if (rands < outcome.get(i)) {
                value = i + 1;
                break;
            }
        }
    }
    }

    public void setProbabilities(Number... probab){
        probability = probab.clone();
    }
        public int getSides () {
            return sides;
        }
    }