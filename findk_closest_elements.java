class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> less = new ArrayList<>(), greater = new ArrayList<>(),
                  lessResult = new LinkedList<>(), greaterResult = new LinkedList<>();
 
    for (Integer i : arr) {
        if (i <= x) less.add(i);
        else greater.add(i);
    }
    
    Collections.reverse(less);
    int  i = 0, j = 0, n = less.size(), m = greater.size();
    for (int size=0;size<k;size++) {
        if (i < n && j < m) {
            if (Math.abs(less.get(i) - x) <= Math.abs(greater.get(j) - x)) lessResult.add(less.get(i++));
            else greaterResult.add(greater.get(j++));
        }
        else if (i < n) lessResult.add(less.get(i++));
        else greaterResult.add(greater.get(j++));
    }

    Collections.reverse(lessResult);
    lessResult.addAll(greaterResult);
    return lessResult;
    }
}
