class Solution {
    public int minInsertions(String s) {
            int n=s.length();
        
            int d []=new int[n+1];
            for(int i=1;i<=n;i++){
                int temp[]= new int[n+1];

                for(int j=1;j<=n;j++){
                    if(s.charAt(i-1)==s.charAt(n-j)){
                    temp [j]=d[j-1]+1;
                    }
                    else temp[j]=Math.max(d[j],temp[j-1]);
                }
                d=temp;
            }
            return n-d[n];
    }
}