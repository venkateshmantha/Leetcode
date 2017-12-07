class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        int color = image[sr][sc];
        DFS(image,sr,sc,color,newColor);
        return image;
        
    }
    
    public void DFS(int[][] image, int sr, int sc, int color, int newColor){
        int rows = image.length;
        int cols = image[0].length;
        if(sr < 0 || sr >= rows || sc < 0 || sc >= cols || image[sr][sc]!=color)
            return;
        image[sr][sc] = newColor;
        DFS(image,sr-1,sc,color,newColor);
        DFS(image,sr+1,sc,color,newColor);
        DFS(image,sr,sc-1,color,newColor);
        DFS(image,sr,sc+1,color,newColor);
    }
}
