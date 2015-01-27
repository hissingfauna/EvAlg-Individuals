import java.util.ArrayList;

	public interface OperationInterface {
		
		public ArrayList<Individual> run(ArrayList<Individual> individuals);
		public boolean isEvaluation();

	}