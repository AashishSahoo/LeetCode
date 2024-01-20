class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        if( arr.length==0){
            return false;
        }

        Map<Integer,Integer> mp= new HashMap<>();
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i,mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
        }

        Set<Integer> set= new HashSet<>(mp.values());
        if(mp.size()==set.size()){
            return true;
        }
        return false;
    }
}
// all elements are mapped into map
// then mapped elements are again mapped into set 
// and then check if the size of set and map is equal or not and return answer accordingly