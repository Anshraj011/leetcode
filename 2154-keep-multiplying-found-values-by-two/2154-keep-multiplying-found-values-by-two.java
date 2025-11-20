class Solution {
    public int findFinalValue(int[] nums, int org) {
        Arrays.sort(nums);
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==org)org*=2; 
        }
        return org;
    }
}