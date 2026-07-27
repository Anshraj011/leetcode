class Solution {
    public int maxProduct(int[] nums) {
        int first=0 , sec=0;
        for(int i:nums){
            if(first<=i){
                sec=first;
                first=i;
            }
            else if(sec<i){
                sec=i;
            }
        }
        return(first-1)*(sec-1);
    }
}