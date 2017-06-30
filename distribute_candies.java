public class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        int len = candies.length;
        for(int i:candies)
            set.add(i);
        return Math.min(set.size(),len/2);
    }
}