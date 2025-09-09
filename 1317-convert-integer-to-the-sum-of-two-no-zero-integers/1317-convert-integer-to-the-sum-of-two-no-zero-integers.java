class Solution {
    public int[] getNoZeroIntegers(int n) {
        int takeplace=1;
        int a=n;
        int b=0;
       while(n>1){
        int take=1;
        int rem=n%10;
        if(rem==1) take=2; 
        a=a-(take*takeplace);
        b+=take*takeplace;
        n=(n-take)/10;
        takeplace*=10;
       } 
       return new int [] {a,b};
    }
}