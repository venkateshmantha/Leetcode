public class Solution {
    public int compareVersion(String version1, String version2) {
       
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        
        int len1 = v1.length;
        int len2 = v2.length;
        for(int i=0;i<Math.max(v1.length,v2.length);i++){

            int val1 = i < len1 ? Integer.parseInt(v1[i]) : 0;
            int val2 = i < len2 ? Integer.parseInt(v2[i]) : 0;
            
            if(val1>val2)
                return 1;
            else if(val1<val2)
                return -1;
            else
                continue;
        }
        return 0;
    }
}