class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int count=0;
      
    for(int i=0;i< flowerbed.length;i++){
       if( flowerbed[i]==0 && (i==0 ||  flowerbed[i-1]==0) && (i== flowerbed.length-1 ||  flowerbed[i+1]==0)  ){
           count++;
            flowerbed[i]=1;
       }
    }
      return count>=n;

//         in if condition all edge cases and middle condtion are considered
//         only possiblites of puting plant i.e 1 is considered and not 0
    }
}