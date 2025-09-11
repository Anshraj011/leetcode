class Solution {
    static int check_max(int [] nums, int s, int e){
        int maxi=Integer.MIN_VALUE;
        for(int i=s;i<e;i++){
            maxi=Math.max(nums[i],maxi);
        }
        return maxi;
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
        int s=0;
        int e=k;
        int arr[]=new int[nums.length-k+1];
        int index=0;
        while(e<=nums.length){
            int maxi=(check_max(nums,s,e));
             arr[index]=maxi;
             index++;
            s++;
            e++;
        }
    
     
     return arr;
    }
}