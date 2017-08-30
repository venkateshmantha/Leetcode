import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class data {

	public static void main(String[] args){

		String fileName="C:/Users/venkateshmantha/Downloads/Data-consolidation_InputForSubmission_1.txt";
		ArrayList<Integer> list = new ArrayList<Integer>();
	       try{
	          FileReader inputFile = new FileReader(fileName);
	          BufferedReader bufferReader = new BufferedReader(inputFile);
	          String line;
	          while ((line = bufferReader.readLine()) != null)   {
	            String[] nums = line.split(",");
	            for(String num:nums){
	            	list.add(Integer.parseInt(num));
	            }
	          }
	          bufferReader.close();
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());
	       }

	       int size = list.size();
	       double sum=0;
	       for(int num:list){
	    	   sum += num;
	       }
	       System.out.println((double) sum/size);
	       System.out.println((int)Math.round(sum/size));

	}

}
