class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<List<Integer>> trio=new ArrayList<>();

       for(int i=0;i<=rowIndex;i++){

           int dp[]=new int[i+1];

        dp[0]=1;
        dp[dp.length-1]=1;
           for(int j=1;j<dp.length-1;j++){
               dp[j]=trio.get(i-1).get(j-1)+trio.get(i-1).get(j);
           }
          List<Integer> row=new ArrayList<>();
         for(int a:dp){
             row.add(a);
         }
         trio.add(row);
      
       }
       return trio.get(rowIndex);

    }
}