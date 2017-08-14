public class Solution {
    public boolean judgeCircle(String moves) {
        int hor =0;
        int ver =0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='L')
                hor--;
            else if(moves.charAt(i)=='R')
                hor++;
            else if(moves.charAt(i)=='U')
                ver++;
            else
                ver--;
        }
        if(hor==0 && ver==0)
            return true;
        else
            return false;
    }
}