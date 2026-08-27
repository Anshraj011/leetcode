class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int cnt=0;
     for(int i : costs){

        sum+=i;
        if(sum>coins){
            break;
        }
        cnt++;

     }
     return cnt;
    }
}