class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //   List<Integer> l=new ArrayList<>();
    
    int k=0;
    while(k<n){
        nums1[m++]=nums2[k++];

    }
    Arrays.sort(nums1);

     
    }
}