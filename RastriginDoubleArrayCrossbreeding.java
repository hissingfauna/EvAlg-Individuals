import java.util.ArrayList;


public class RastriginDoubleArrayCrossbreeding implements OperationInterface {
	
	public RastriginDoubleArrayCrossbreeding() {};
	
	public ArrayList<Individual> run(ArrayList<Individual> individuals) {
		
		for (int i = 0; i < individuals.size() - 1; ++i) {
			RastriginDoubleArray momsGenes = (RastriginDoubleArray) individuals.get(i).getGenotype();
			RastriginDoubleArray dadsGenes = (RastriginDoubleArray) individuals.get(i+1).getGenotype();
			Individual kid = new Individual(new RastriginDoubleArray(momsGenes, dadsGenes));
			individuals.add(kid);
		}
		return individuals;
	}
	
	public boolean isEvaluation() {
		return false;
	}

}