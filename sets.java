import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;

public class set {

	public static void main(String[] args){

	String filename = "C:/Users/venkateshmantha/Downloads/PracticeInput.txt";
	HashSet<Character> count = new HashSet();
	count.add('1');
	count.add('2');
	count.add('3');
	HashSet<Character> fill = new HashSet();
	fill.add('E');
	fill.add('F');
	fill.add('S');
	HashSet<Character> color = new HashSet();
	color.add('G');
	color.add('P');
	color.add('R');
	HashSet<Character> shape = new HashSet();
	shape.add('O');
	shape.add('D');
	shape.add('S');
	ArrayList<HashSet<Character>> list = new ArrayList();
	list.add(count);
	list.add(fill);
	list.add(color);
	list.add(shape);
	try{
		FileReader input = new FileReader(filename);
		BufferedReader bf = new BufferedReader(input);
		int t = Integer.parseInt(bf.readLine());
		String line = "";
		int n = 1;
		while ((line = bf.readLine()) != null){
            String[] sets = line.split(" ");
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<4;i++){
            	char a = sets[0].charAt(i);
            	char b = sets[1].charAt(i);
            	if(a==b)
                	sb.append(a);
                else{
                	HashSet<Character> set = list.get(i);
                	for(char c: set){
                		if(c!=a && c!=b)
                			sb.append(c);
                	}
                }
            }
            System.out.println("Group " + n + ": " + sb.toString());
            n++;
        }
        bf.close();

	}catch(Exception e){
		System.out.println(e.getMessage());
	}


	}

}