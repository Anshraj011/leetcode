class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        int n= arr.length;
        Arrays.sort(arr);
        int cnt=0;
        int i=0,j=n-1;
       while(i<=j){
            if((arr[i]+arr[j])<=limit){
                i++;
            }
            j--;
            cnt++;
        }
        return (cnt);
    }
}