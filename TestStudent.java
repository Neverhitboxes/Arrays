public class TestStudent {
	public static void main(String[] args) {
		//variables
		String in, out;
		double[] mydata;
		int dataSize;
		
		//input user data
		in = JOptionPane.showInputDialog("Enter Data Size:");	
		dataSize = Integer.parseInt(in);
		mydata = new double [dataSize];
		for (int i=0; i<mydata.length; i++){
			in = JOptionPane.showInputDialog("Enter a Data Item:");
			mydata[i] = Double.parseDouble(in);
			Statistics stat = new Statistics (mydata);
			double min = stat.findMin();
			double max = stat.findMax();
			double mean = stat.findMean();
			double median = stat.findMedian();
		}
		//build output string
		out = "Sorted Data:\n";
			for (int i=0;i<sdata.length;i++)
			{
				out = out + sdata[i]+" ";
			}
			out = out+"\n";
			JOptionPane.showMessageDialog(null,out);
	}

}
