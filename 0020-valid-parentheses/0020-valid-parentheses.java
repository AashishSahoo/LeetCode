class Solution {
    public boolean isValid(String s) {
        Stack <Character> st= new Stack<Character>();
       
        for(int i=0;i<s.length();i++){
         
        
         if ( s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
              st.push(s.charAt(i));
          }
          else if(st.isEmpty()){
              return false;
          }
          
          else if(s.charAt(i)==')'  && st.peek()=='('){
              st.pop();
          }

           else if(s.charAt(i)=='}'  && st.peek()=='{'){
              st.pop();
          }

           else if(s.charAt(i)==']'  && st.peek()=='['){
              st.pop();
          }
          else{
              return false;
          }
        }
        return st.isEmpty();
    }
}











class Solution {
    public boolean isValid(String s) {
       Stack <Character> stack=new Stack<>();


    
       for(char c:s.toCharArray()){
        if(c=='(' || c=='{' || c=='['){
            stack.push(c);
        }
        
        else{
            if(c==')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }
              if(c=='}'){
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }
              if(c==']'){
                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }
        }
       }


       return stack.isEmpty();
    }
}
