import java.util.ArrayList;
import java.util.Random;

public class RastriginDoubleArrayMutation implements OperationInterface {

    private static final Random generator = new Random();

    private double probabilityOfMutation;

    public RastriginDoubleArrayMutation(double p) {
        this.probabilityOfMutation = p;
    }

    public ArrayList<Individual> run(ArrayList<Individual> individuals) {
        try {
            for (Individual i : individuals) {
                RastriginDoubleArray rda = (RastriginDoubleArray) i.getGenotype();
                for (int j = 0; j < rda.getNumOfDimensions(); ++j) {
                    if (generator.nextDouble() < probabilityOfMutation)
                        rda.getGenes()[j] = -5.12 + generator.nextDouble() * 10.24;
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return individuals;
    }
    
    public double getProbabilityOfMutation() {
    	return probabilityOfMutation;
    }

}
