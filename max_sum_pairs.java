class MapSum {

    HashMap<String,Integer> map = new HashMap();
    HashSet<String> keys = new HashSet();
    public MapSum() {
        
        
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
        keys.add(key);
        
    }
    
    public int sum(String prefix) {
        int tot = 0;
        for(String key:keys){
            if(key.startsWith(prefix))
                tot += map.get(key);
        }
        return tot;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
