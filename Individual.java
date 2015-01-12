public class Individual {

    private GenotypeInterface genotype;
    private double fitness;

    public Individual(GenotypeInterface g) {
        this.genotype = g;
        this.fitness = 0;
    }

    public GenotypeInterface getGenotype() {
        return genotype;
    }

    public double getFitness() {
        return fitness;
    }
    
    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

}
