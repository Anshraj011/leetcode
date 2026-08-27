class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum1=0;
        int n=gas.length;
        for(int i: gas){
            sum1+=i;
        }
        int sum2 = 0;
        for(int i: cost){
            sum2+=i;
        }
        if(sum1<sum2) return -1;
    
    int res=0;
    int ans=0;
    for(int i=0;i<n;i++ ){
      int  total=gas[i]-cost[i]+ans;
        if(total<0){
            res=i+1;
            ans=0;
        }
        else ans=total;
    }
        return res;
    }
}