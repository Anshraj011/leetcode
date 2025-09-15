class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int n = chars.length;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int cnt = 0;

            while (i < n && chars[i] == ch) {
                cnt++;
                i++;
            }
            i--;

            chars[index++] = ch;

            if (cnt > 1) {
                String str = Integer.toString(cnt);
                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }

        return index;
    }
}