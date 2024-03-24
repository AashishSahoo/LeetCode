class Solution {
    public int numberOfMatches(int n) {
        int match_count=0;
        while(n>1){
            if(n%2==0){
                match_count+=(n/2);
            }
            else{
                match_count+=(n-1)/2;
                n++;
            }
            n=n/2;
            

        }      
        return match_count; 
    }
}