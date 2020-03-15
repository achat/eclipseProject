package gr.uom.achat.quickstart;

import org.apache.commons.math3.stat.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class App
{
    public static void main( String[] args )
    {
       double[] values = new double[] {65, 51, 16, 11, 6519, 191, 0, 98, 11244, 1, 32};
       DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
       
       for(double v: values)
    	   descriptiveStatistics.addValue(v);
       
       double mean = descriptiveStatistics.getMean();
       double median = descriptiveStatistics.getPercentile(50);
       double standardDeviation = descriptiveStatistics.getStandardDeviation();
       
       System.out.println("Mean: " + mean);
       System.out.println("Median: " + median);
       
    }
}