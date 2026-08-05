class Solution {
    public String intToRoman(int n) {
        int [] arr={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String [] str={ "I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();
    for(int i=arr.length-1;i>=0;i--){
        int t=n/arr[i];
        while(t-->0){
            sb.append(str[i]);
        }
        n%=arr[i];
    }
    return sb.toString();
    }
}