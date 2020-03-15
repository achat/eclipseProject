package gr.uom.achat.quickstart;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Statistics {
	
	//Simple statistics method
	public double calcMedian() {
		
		   //another comment
		   //another 2
	       double[] values = new double[] {65, 51, 16, 11, 6519, 191, 0, 98, 11244, 1, 32};
	       DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
	       
	       for(double v: values)
	    	   descriptiveStatistics.addValue(v);
	       
	       double median = descriptiveStatistics.getPercentile(50);
	       
	       return median;
	       
	    
	}

}
