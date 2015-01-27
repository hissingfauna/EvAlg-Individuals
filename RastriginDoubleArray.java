import java.util.Random;

public class RastriginDoubleArray implements GenotypeInterface {

    private final Random generator = new Random();

    private final int numOfDimensions;
    private double[] genes;
    
    private final double lower_bound = -5.12;
    private final double difference = 10.14;

    public RastriginDoubleArray(int numOfDimensions) {
        this.numOfDimensions = numOfDimensions;
        this.genes = new double[numOfDimensions];
        for (int i = 0; i < numOfDimensions; ++i) {
            genes[i] = lower_bound + generator.nextDouble() * difference;
        }
    }
    
    public RastriginDoubleArray(RastriginDoubleArray momsGenes, RastriginDoubleArray dadsGenes) {
    	this.numOfDimensions = momsGenes.getNumOfDimensions();
    	this.genes = new double[numOfDimensions];
    	for (int i = 0; i < numOfDimensions / 2; ++i) {
    		genes[i] = momsGenes.getGenes()[i];
    	}
    	for (int i = numOfDimensions / 2; i < numOfDimensions; ++i) {
    		genes[i] = dadsGenes.getGenes()[i];
    	}
    }

    public int getNumOfDimensions() {
        return numOfDimensions;
    }

    public double[] getGenes() {
        return genes;
    }

}
