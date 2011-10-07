import javax.swing.JOptionPane;
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
			}
		Statistics stat = new Statistics (mydata);
		double min = stat.findMin();
		double max = stat.findMax();
		double mean = stat.findMean();
		double median = stat.findMedian();
		double []sortdata = stat.getSortedData();
		double []OrigData = stat.getOrigData();
		//build output string
		out ="Original Data:\n";
			for (int i=0; i<OrigData.length; i++)
			 out=out+OrigData[i]+" ";
		out+="\n";
		out+="Sorted Data:\n";
			for (int i=0; i<sortdata.length; i++)
				 out=out+sortdata[i]+" ";
		out+="\n";
		out+="Min:"+min+"\n";
		out+="Max:"+max+"\n";
		out+="Mean:"+mean+"\n";
		out+="Median:"+median+"\n";
			JOptionPane.showMessageDialog(null,out);
	}

}

