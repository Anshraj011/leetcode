class Solution {
    public int longestPalindrome(String[] words) {

        int[][] freq = new int[26][26];

        int count = 0;
        boolean center = false;

        for (String s : words) {

            int a = s.charAt(0) - 'a';
            int b = s.charAt(1) - 'a';

            
            if (freq[b][a] > 0) {
                count += 4;
                freq[b][a]--;
            }
            else {
                
                freq[a][b]++;
            }
        }

        
        for (int i = 0; i < 26; i++) {

            if (freq[i][i] > 0) {
                count += 2;
                break;
            }
        }

        return count;
    }
}