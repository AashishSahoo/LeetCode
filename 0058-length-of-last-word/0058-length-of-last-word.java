class Solution {
    public int lengthOfLastWord(String s) {
        String n= s.trim();
        String r[]= n.split(" ");
        return r[r.length-1].length();
    }
}