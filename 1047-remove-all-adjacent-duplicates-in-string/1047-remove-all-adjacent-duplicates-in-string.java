class Solution {
    public String removeDuplicates(String s) {
        int n= s.length();
        StringBuilder sb = new StringBuilder();
       for(char c : s.toCharArray()){
        if(sb.length() == 0 || sb.charAt(sb.length() -1) != c ) sb.append(c);
        else sb.deleteCharAt(sb.length()-1);
       }
        return sb.toString();
    }
}