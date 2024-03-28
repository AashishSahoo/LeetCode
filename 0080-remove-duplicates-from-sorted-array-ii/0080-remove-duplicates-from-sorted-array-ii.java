class Solution {
    public int removeDuplicates(int[] nums) {
        int i=2;
        int j=2;
        while(i<nums.length){
            if(nums[i]!=nums[j-2]){
                nums[j]=nums[i];
                j++;
            }
            i++;
        }
        return j;
    }
}

// [ 1,   1,    1,  2,  2,   2 ,  3,  3]
//   j-2      i/j
//                  i
// 