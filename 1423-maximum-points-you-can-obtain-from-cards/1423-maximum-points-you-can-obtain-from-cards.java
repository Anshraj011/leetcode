class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            
        }
        int max_sum= sum;
        int r=n-1;
        int i=k-1;
        while(i>=0){
            sum-=arr[i];
            i--;
            sum+=arr[r];  
            r--;
            max_sum=Math.max(sum,max_sum);
        }
    return max_sum;

    }
}