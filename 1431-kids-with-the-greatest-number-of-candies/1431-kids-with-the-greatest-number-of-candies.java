class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int max=candies[0];
     for(int i=0;i<candies.length;i++){
         if(max<=candies[i]){
             max=candies[i];
         }
     }  
     List<Boolean> result= new ArrayList<>();
     for(int i=0;i<candies.length;i++){
         if(candies[i]+extraCandies>=max){
            //  candies[i]=true;
            result.add(true);
         }
         else{
            //  candies[i]=false;
             result.add(false);
         }
     } 
     return result;
 
    }
}
// maxium candies in the array is found and saved in max variable
// in the  second for loop extraCandie is add with each element in the array and compared if it is => max  
//  and accordingly true or false is set to that particular index