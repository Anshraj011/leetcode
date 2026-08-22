class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n= plantTime.length;
        int [][] vec = new int[n][2];
        for(int i=0;i<n;i++){
            vec[i][0]=plantTime[i];
            vec[i][1]= growTime[i];
        }
        Arrays.sort(vec, (p1,p2) -> p2[1]-p1[1]);
        int max=0;
        int prev=0;
        for(int i=0;i<n;i++){
            prev+=vec[i][0];
            int curr= prev+vec[i][1];
            max=Math.max(max,curr);
        }
        return max;

    }
}