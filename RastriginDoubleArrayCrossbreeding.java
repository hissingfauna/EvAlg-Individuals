import java.util.ArrayList;


public class RastriginDoubleArrayCrossbreeding implements OperationInterface {
	
	public RastriginDoubleArrayCrossbreeding() {};
	
	public ArrayList<Individual> run(ArrayList<Individual> individuals) {
		int parents_end = individuals.size();
		
		for (int i = 0; i < parents_end - 1; i += 2) {			
			RastriginDoubleArray mumsGenes = (RastriginDoubleArray) individuals.get(i).getGenotype();
			RastriginDoubleArray dadsGenes = (RastriginDoubleArray) individuals.get(i+1).getGenotype();
			
			Individual kid = new Individual(new RastriginDoubleArray(mumsGenes, dadsGenes));
			individuals.add(kid);
		}
		
		return individuals;
	}

}
