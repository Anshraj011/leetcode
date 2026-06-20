class Solution {
    static void rev(char [] arr , int left,int right){
        int n= arr.length;
        while(left <= right){
            char temp= arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }
    public String reverseWords(String s) {
        char [] str= s.toCharArray();
        int n= str.length;
        int st=0;
        for(int e=0;e<=n;e++){
            if(e==n || str[e]== ' '){
                rev(str,st,e-1);
                st=e+1;
            }
        }
        return new String(str);
    }
}