class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        while(start<end){
            int ht=Math.min( height[start],height[end]);
            int wd= end- start;

            int area=ht*wd;
            if(maxArea<area){
                maxArea=area;
            }
            if(height[start]>height[end]){
                end--;
            }
            else{
                start++;
            }
            

        }
        return maxArea;

    }
}

//  two pointer conccept is used
// we get minnimum from lefft and right  side and take it as height
// and for width we consider end - start
// and max of area is returned 


