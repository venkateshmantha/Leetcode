public class Solution {
    public String convert(String s, int numRows) {
        if(s.isEmpty() || numRows ==1)
            return s;
        int len = s.length();
        StringBuilder res = new StringBuilder();
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) sb[i] = new StringBuilder();
        char op = '+';
        int j=0;
        for(int i=0;i<len;i++){
            sb[j].append(s.charAt(i));
            if(j==0)
                op='+';
            else if(j==numRows-1)
                op='-';
            if(op=='+')
                j++;
            else if(op=='-')
                j--;
            
        }
        for(int i=0;i<numRows;i++){
            res.append(sb[i].toString());
        }
        return res.toString();
    }
}