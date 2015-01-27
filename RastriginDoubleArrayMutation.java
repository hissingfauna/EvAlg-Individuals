import java.util.ArrayList;
import java.util.Random;

public class RastriginDoubleArrayMutation implements OperationInterface {

    private static final Random generator = new Random();

    private final double probabilityOfMutation;
        
    private final double lower_bound = -5.12;
    private final double difference = 10.24;

    public RastriginDoubleArrayMutation(double p) {
        this.probabilityOfMutation = p;
    }

    public ArrayList<Individual> run(ArrayList<Individual> individuals) {
    	try {    		
	    	for (Individual i : individuals) {
		    	RastriginDoubleArray rda = (RastriginDoubleArray) i.getGenotype();
		    	for (int j = 0; j < rda.getNumOfDimensions(); ++j) {
			    	if (generator.nextDouble() < probabilityOfMutation)
			    		rda.getGenes()[j] = lower_bound + generator.nextDouble() * difference;
		    	}
	    	}
    	} catch (IllegalArgumentException e) {
    		e.printStackTrace();
    	}
    		return individuals;
    	}
    	
    	public boolean isEvaluation() {
    		return false;
    	}
    
    public double getProbabilityOfMutation() {
    	return probabilityOfMutation;
    }

}
