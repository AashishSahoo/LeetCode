class Solution {
    public void reverseString(char[] s) {
        // [ s, g, t, w, a]
       int k=s.length-1;
       for(int i=0;i<s.length/2;i++){
           char temp=s[i];
           s[i]=s[k];
           s[k]=temp;
           k--;
       }       
    }
}