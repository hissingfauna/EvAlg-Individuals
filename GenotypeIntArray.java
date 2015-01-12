import java.util.Random;

public class GenotypeIntArray implements GenotypeInterface {

    private final Random generator = new Random();

    private final int numOfDimensions;
    private int[] genes;

    public GenotypeIntArray(int numOfDimensions) {
        this.numOfDimensions = numOfDimensions;
        this.genes = new int[numOfDimensions];
        for (int i = 0; i < numOfDimensions; ++i) {
            genes[i] = generator.nextInt();
        }
    }

    public int getNumOfDimensions() {
        return numOfDimensions;
    }

    public int[] getGenes() {
        return genes;
    }

}