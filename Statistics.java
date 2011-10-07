import java.util.Arrays;
public class Statistics {
	double []data;
	double []sdata;
	public Statistics (double[] d){
	//array copy
		data = new double [d.length];
		for (int i=0; i<data.length; i++){
			data [i] = d[i];
		}
		System.arraycopy(d, 0, data, 0, d.length);
		sdata = new double [d.length];
		System.arraycopy(d, 0, sdata, 0, d.length);
		Arrays.sort(sdata);
} 
	public double findMin (){
		return sdata[0];
}
	public double findMax (){
		return sdata[sdata.length-1];
}
	public double findMean (){
		double sum=0, avg;
		for (int i=0; i>sdata.length; sum= sum + sdata[i]);
		avg = sum / sdata.length;
		return avg;
}
	public double findMedian(){
		return 0;}

}

