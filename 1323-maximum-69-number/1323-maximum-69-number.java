class Solution {
    public int maximum69Number (int num) {
       
       int placeValue=-1;
       int cnt=0;
       int temp=num;
       while(temp>0){
        
        int rem=temp%10;
        if(rem==6){
            placeValue=cnt;
        }
        temp/=10;
        cnt++;

       } 
       if(placeValue==-1) return num;
      else return num + (int) (3*Math.pow(10,placeValue));
    }
}