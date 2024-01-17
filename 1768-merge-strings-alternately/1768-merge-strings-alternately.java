class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result= new StringBuilder();
        for(int i=0;i<word1.length() || i<word2.length();i++){
            if(i<word1.length()){
            result.append(word1.charAt(i));
            }
            if(i<word2.length()){
            result.append(word2.charAt(i));

            }

        }
        String rs= result.toString();
        return rs;
        
    }
}
// using String Builder class alternate characters are added 
//  and at the end the remaining characters are added as a string not single character so no need for edge condition of remaining characters