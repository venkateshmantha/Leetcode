public class Solution {
    public int countPrimes(int n) {
        boolean[] sieve = new boolean[n];
        int count=0;
        for(int i=2;i<n;i++){
            if(sieve[i]==false){
                count++;
                for(int j=2;i*j<n;j++){
                    sieve[i*j]=true;
                }
            }
        }
        return count;
    }
}