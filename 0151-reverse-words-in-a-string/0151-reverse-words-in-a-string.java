class Solution {
    public String reverseWords(String s) {
        String rev[]= s.trim().split("\\s+");
        String out="";

       for(int i=rev.length-1;i>=0;i--){
           out += rev[i];
           if(i>0){
               out +=" ";
           }
       }

       return out;
    }
}
        // Trim the input string to remove leading and trailing spaces
        // Initialize the output string
        // Iterate through the words in reverse order
            // Append the current word and a space to the output
        // Append the first word to the output (without trailing space)
