import java.util.ArrayList;

public class RastriginDoubleArrayEvaluation implements OperationInterface {

    public RastriginDoubleArrayEvaluation() {}

    public ArrayList<Individual> run(ArrayList<Individual> individuals) {
    	try {
    		int A = 10;
	    	for (Individual i : individuals) {
		    	RastriginDoubleArray rda = (RastriginDoubleArray) i.getGenotype();
		    	double fitness = 10 * rda.getNumOfDimensions();
		    	for (int j = 0; j < rda.getNumOfDimensions(); ++j) {
		    		double gene = rda.getGenes()[j];
		    		fitness += (gene * gene - A * Math.cos(2 * Math.PI * gene));
		    	}
		    	i.setFitness(fitness);
	    	}
    	} catch (IllegalArgumentException e) {
    		e.printStackTrace();
    	}
    	return individuals;
    }
   
    public boolean isEvaluation() {
    	return true;
    }

}