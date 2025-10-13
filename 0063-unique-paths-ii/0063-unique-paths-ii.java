class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;

         
        int d[][]=new int[m][n];
        
       // d[0][0]=1;
        for(int i=0;i<n;i++){
            if(arr[0][i]== 1){ d[0][i]=0; 
            break;
            }
           else d[0][i]=1;
        }
            for(int i=0;i<m;i++){
                 if(arr[i][0]==1){ 
                    d[i][0]=0;
                  break ;
                 }
          else  d[i][0]=1;
        }
        for(int i=1;i<m;i++){
        for(int j=1;j<n;j++){
            if(arr[i][j]== 1 ) d[i][j]=0;
             else   d[i][j]=d[i-1][j]+d[i][j-1];

        }

        }
        return d[m-1][n-1];
    }
}  
    
