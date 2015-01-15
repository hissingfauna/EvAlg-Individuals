import java.util.Comparator;

public class IndividualsComparator implements Comparator<Individual> {
	
	public int compare(Individual ind1, Individual ind2) {

		if (ind1.getFitness() < ind2.getFitness()) {
			return -1;
		} else if (ind1.getFitness() == ind2.getFitness()) {
			return 0;
		} else {
			return 1;
		}
		
	}

}