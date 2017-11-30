public class Solution{
int[][] rotateImage(int[][] a) {
    int n = a.length;
    for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            int tmp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = tmp;
        }
    }
    for(int i=0;i<n;i++){
        int start = 0;
        int end = n-1;
        while(start<end){
            int tmp = a[i][start];
            a[i][start] = a[i][end];
            a[i][end] = tmp;
            start++;
            end--;
        }
    }
    return a;
}
}
