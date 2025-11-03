class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
            int d []=new int[m+1];
            for(int i=1;i<=n;i++){
                int temp[]= new int[m+1];

                for(int j=1;j<=m;j++){
                    if(text1.charAt(i-1)==text2.charAt(j-1)){
                    temp [j]=d[j-1]+1;
                    }
                    else temp[j]=Math.max(d[j],temp[j-1]);
                }
                d=temp;
            }
            return d[m];

    }
}