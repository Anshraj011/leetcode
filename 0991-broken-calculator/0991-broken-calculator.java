class Solution {
    public int brokenCalc(int sv, int target) {
        if(target<=sv ) return sv-target;
        int cnt=0;
        while(target>sv){
            if(target%2==0){
                target/=2;
                cnt++;
            }
            else{
                target++;
                cnt++;
            }
        }


          return cnt +(sv-target);  
    }
}