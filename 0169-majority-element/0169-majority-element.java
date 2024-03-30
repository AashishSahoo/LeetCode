class Solution {
    public int majorityElement(int[] nums) {
     int n=nums.length/2;
     Map <Integer,Integer> m=new HashMap<>();
    
    for(int num:nums){
        m.put(num,m.getOrDefault(num,0)+1);
    }

    for(int i: nums){
      if(m.get(i)>n)return i;
    }

    return -1;
    }
}