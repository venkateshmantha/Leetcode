import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class matric {

	public static void main(String[] args){

	String fileName="C:/Users/venkateshmantha/Downloads/Matrix-Transpose_InputForSubmission_1.txt";
	ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	  try{
	          FileReader inputFile = new FileReader(fileName);
	          BufferedReader bufferReader = new BufferedReader(inputFile);
	          String line;
	          while ((line = bufferReader.readLine()) != null)   {
	            String[] nums = line.split(" ");
	            ArrayList<Integer> tmp = new ArrayList();
	            for(String num:nums){
	            	tmp.add(Integer.parseInt(num));
	            }
	            list.add(tmp);
	          }
	          bufferReader.close();
	       }catch(Exception e){
	          System.out.println("Error while reading file line by line:" + e.getMessage());
	       }

	  int m = list.size();
	  int n = list.get(0).size();

	  for(int i=0;i<n;i++){
		  for(int j=0;j<m;j++){
			  System.out.print(list.get(j).get(i));
			  System.out.print(" ");
		  }
		  System.out.println();
	  }

	}

}
