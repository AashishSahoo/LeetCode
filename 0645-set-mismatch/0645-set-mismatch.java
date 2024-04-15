class Solution {
    public int[] findErrorNums(int[] nums) {
        Map <Integer , Integer> h=new HashMap<>();

        int duplicate=-1;
        int missing=1;
        for(int i:nums){
         h.put(i, h.getOrDefault(i,0)+1);
        }

        for(int i=1;i<=nums.length;i++){
            if(h.containsKey(i)){
                if(h.get(i)==2){
                    duplicate=i;
                }
            }
            else{
             missing=i;
            }
        }


        return new int[]{duplicate,missing};
    }
}