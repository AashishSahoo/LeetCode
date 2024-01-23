class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> arr= new ArrayList<Integer>();

        for(int i:nums1){
            arr.add(i);
        }


        for(int i: nums2){
            arr.add(i);
        }

        Collections.sort(arr);
        int size=arr.size();

        if(size%2 == 0){
            int m1=arr.get(size/2-1);
            int m2=arr.get(size/2);
            return  (double) (m1+m2)/2;
        }
        else{
            return  (double) arr.get(size/2);
        }
    }
}