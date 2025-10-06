class Solution {
    static void reverse(int [] arr, int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;

        }
    }
    public void rotate(int[] nums, int k) {
        int s=0;
        int n=nums.length;
        k=k%n;
        reverse(nums,s,n-1);
        reverse(nums,s,k-1);
        reverse(nums,k,n-1);

    }
}