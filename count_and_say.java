public class Solution {
    public String countAndSay(int n) {
        if(n==1)
            return "1";
        if(n==2)
            return "11";

        String in = "11";
        for(int i=3;i<=n;i++){
            int len = in.length();
            String out = "";
            int cnt=1;
            for(int j=0;j<len-1;j++){

                if(in.charAt(j)==in.charAt(j+1)){
                    cnt++;
                }
                else{
                    out+=Integer.toString(cnt)+in.charAt(j);
                    cnt=1;
                }
            }
                if(in.charAt(len-1)!=in.charAt(len-2)){
                    out+="1"+in.charAt(len-1);
                }
                else
                	out+=Integer.toString(cnt)+in.charAt(len-1);
            in=out;
        }
        return in;
    }
}