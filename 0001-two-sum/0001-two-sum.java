class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int diff=target-arr[i];
            for(int j=i+1;j<n;j++)
          if(arr[j]==diff) return new int []{i,j};
        }
        return arr;
    }
}