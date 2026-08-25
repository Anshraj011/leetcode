class Solution {
    public int minimumRounds(int[] tasks) {

       Map<Integer,Integer> map= new HashMap<>();
       for(int e: tasks){
        map.put(e,map.getOrDefault(e,0)+1);
       } 
       int ans=0;
       for(int i : map.values()){
        if(i==1){
            return -1;
           
        }
        else{
            if(i%3==0){
                ans+=i/3;
            }
           else ans+=(i/3 +1);
        }
       }
       return ans;
    }
}