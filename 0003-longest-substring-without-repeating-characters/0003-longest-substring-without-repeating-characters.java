class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> map= new HashSet<>();
       int j =0;
       int maxi=0;
       for(int i=0;i<s.length();i++){
        char p =s.charAt(i);
        while(map.contains(p)){
            map.remove(s.charAt(j));
            j++;
        }
            maxi=Math.max(maxi,i-j+1);
        
            map.add(p);
        
        
       
       }
       return maxi; 
    }
}