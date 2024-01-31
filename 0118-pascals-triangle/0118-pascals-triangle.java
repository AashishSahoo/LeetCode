class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l= new ArrayList<>();
        
        for(int i=0;i<numRows;i++){

            int dp[]=new int[i+1];

            dp[0]=1;
            dp[dp.length-1]=1;

            for(int j=1;j<dp.length-1;j++){
                dp[j]=l.get(i-1).get(j-1) + l.get(i-1).get(j);
            }

            List<Integer> row=new ArrayList<>();
            for(int a:dp){
                row.add(a);
            }
            l.add(row);
        }
          return l;
    }
}