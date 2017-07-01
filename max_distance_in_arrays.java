public class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min=Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;	
        int n = arrays.size();
        int min_list=0;
        int max_list=0;
        for(int i=0;i<n;i++){
            List curr_list = arrays.get(i);
            int first_elem = (int)curr_list.get(0);
            int len = curr_list.size();
            int last_elem = (int)curr_list.get(len-1);
            
            if(first_elem<min){
                min = first_elem;
                min_list =i;
            } 
            
            if(last_elem>max ){
                max = last_elem;
                max_list =i;
            } 
        }
 
        
        if(max_list!=min_list)
            return Math.abs(min-max);
        
        int min2 = Integer.MAX_VALUE;
        
        for(int i = 0;i<n;i++){
            List curr_list = arrays.get(i);
            int first_elem = (int)curr_list.get(0);
            if(i==min_list)
                continue;
            min2 = Math.min(min2,first_elem);
        }
        
        int max2 = Integer.MIN_VALUE; 
        for(int i = 0;i<n;i++){
            List curr_list = arrays.get(i);
            int len = curr_list.size();
            int last_elem = (int)curr_list.get(len-1);
            if(i==max_list)
                continue;
            max2 = Math.max(max2,last_elem);
        }
        return Math.max(max - min2,max2 - min);
            
        
    }
}