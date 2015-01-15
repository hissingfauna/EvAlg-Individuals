import java.util.ArrayList;
import java.util.Collections;


public class RastriginDoubleArraySelection implements OperationInterface {

	public RastriginDoubleArraySelection() {};
	
	public ArrayList<Individual> run(ArrayList<Individual> individuals) {
		Collections.sort(individuals, new IndividualsComparator());
		for (int i = (individuals.size() + 1)/2; i < individuals.size(); ++i) {
			individuals.remove(i);
		}
		return individuals;
	}
	
}