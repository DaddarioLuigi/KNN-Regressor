package metrics;

import java.util.List;

//escluso da javadoc
public class MAE {

	double mae;
	
	public MAE() {
		mae = 0.0;
	}
	

	/*
	 * get mae error
	 */
	public Double getMAE(List<Double> trained, List<Double> predicted)
	{
		double absolute_error;
		double sum =0;
		
		for(int i=0;i<trained.size();i++)
		{
			absolute_error = Math.abs(predicted.get(i) - trained.get(i));
			sum = sum + absolute_error;
		}
		
		return sum/trained.size();
	}

}
