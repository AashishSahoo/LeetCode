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