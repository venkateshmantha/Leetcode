public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int cnt=0;
        if(n==0)
            return true;
        if(len==1){
            if(flowerbed[0]==0)
                return true;
            else return false;
        }
        for(int i=0;i<len;i++){
            if(i==0){
                if(flowerbed[i]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    cnt++;
                }
            }
            else if(i==len-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[i]=1;
                    cnt++;
                }
            }
            else{
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]==0){
                    flowerbed[i]=1;
                    cnt++;
                }
            }
        }
        return cnt>=n;
    }
}