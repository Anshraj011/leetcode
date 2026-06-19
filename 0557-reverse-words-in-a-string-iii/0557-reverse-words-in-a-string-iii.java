class Solution {
    public String reverseWords(String s) {
        int n= s.length();
        StringBuilder sb= new StringBuilder();
        String [] words = s.split(" ");
        for(String word : words){
            StringBuilder temp= new StringBuilder(word) ;
           sb =sb.append(temp.reverse() + " ");
        }
        return sb.toString().trim();
    }
}