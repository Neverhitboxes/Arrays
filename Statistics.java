import java.util.Arrays;
public class Statistics {
	private double []data;
	private double []sdata;
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
		for (int i=0; i<sdata.length;i++)
			sum= sum + sdata[i];
		avg = sum / sdata.length;
		return avg;
}
	public double findMedian(){
		int index,indexHi,indexLo;
		double median;
		if((sdata.length %2)!=0)
		{index= sdata.length /2;
		median= sdata[index];
		}
		else{
			indexHi= sdata.length /2;
			indexLo= indexHi -1;
			median= (sdata[indexLo]+sdata[indexHi])/2;
		}
		return median;
}
	public double[] getSortedData(){
		return sdata;
	}
	
	public double[] getOrigData(){
		return data;
	}

}

