class Solution {
    public String countAndSay(int n) {
       String s="1";
       for(int i=1;i<n;i++){
        int count=0;
        char temp=s.charAt(0);
        StringBuilder result=new StringBuilder();
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==temp) count++;
            else{
                result.append(count);
                result.append(temp);
                count=1;
                temp=s.charAt(j);
            }
        }
        result.append(count);
        result.append(temp);
        s=result.toString();
       }
        return s;
    }
}