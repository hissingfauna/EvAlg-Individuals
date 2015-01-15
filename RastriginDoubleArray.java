import java.util.Random;

public class RastriginDoubleArray implements GenotypeInterface {

    private final Random generator = new Random();

    private final int numOfDimensions;
    private double[] genes;

    public RastriginDoubleArray(int numOfDimensions) {
        this.numOfDimensions = numOfDimensions;
        this.genes = new double[numOfDimensions];
        for (int i = 0; i < numOfDimensions; ++i) {
            genes[i] = -5.12 + generator.nextDouble() * 10.14;
        }
    }
    
    public RastriginDoubleArray(RastriginDoubleArray mumsGenes, RastriginDoubleArray dadsGenes) {
    	this.numOfDimensions = mumsGenes.getNumOfDimensions();
    	this.genes = new double[numOfDimensions];
    	for (int i = 0; i < numOfDimensions / 2; ++i) {
    		genes[i] = mumsGenes.getGenes()[i];
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
