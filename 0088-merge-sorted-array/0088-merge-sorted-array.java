class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    //   List<Integer> l=new ArrayList<>();
     int idx1=m-1;
     int idx2=n-1;
     int lst=m+n-1;
   
   while(idx1>=0  && idx2>=0){
      if(nums1[idx1]>nums2[idx2]){
        nums1[lst]=nums1[idx1];
        idx1--;
      }
      else{
        nums1[lst]=nums2[idx2];
        idx2--;
      }
      lst--;
   }
    while(idx2>=0){
        nums1[lst]=nums2[idx2];
        idx2--;  
        lst--;      
    }
  
  }
}
