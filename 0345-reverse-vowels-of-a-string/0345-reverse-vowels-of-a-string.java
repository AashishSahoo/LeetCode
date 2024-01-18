class Solution {
    public boolean isVowel( char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;

    }
    public String reverseVowels(String s) {
        char [] chars=s.toCharArray();
        int start= 0;
        int end= s.length()-1;
        while(start<end){

          if(!isVowel(chars[start])){
             start++;
          }

          else if(!isVowel(chars[end])){
              end--;
          }
          else{
              char temp=chars[start];
              chars[start++]=chars[end];
              chars[end--]=temp;
          }
        }
        String result= String.valueOf(chars);
        return result;
    }
}
// 1 String is converted into array of character
//  two pointers are used to compare from both the ends
// and at last its is again converted into String 
