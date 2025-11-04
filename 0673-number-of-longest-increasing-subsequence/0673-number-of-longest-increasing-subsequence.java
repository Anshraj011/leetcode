import java.util.*;

class Solution {
    public int findNumberOfLIS(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int[] d = new int[n];     
        int[] cnt = new int[n];   
        Arrays.fill(d, 1);
        Arrays.fill(cnt, 1);

        int max = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    if (d[i] < d[j] + 1) {
                        d[i] = d[j] + 1;
                        cnt[i] = cnt[j];  
                    } else if (d[i] == d[j] + 1) {
                        cnt[i] += cnt[j]; 
                    }
                }
            }
            max = Math.max(max, d[i]);
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            if (d[i] == max) {
                res += cnt[i];
            }
        }

        return res;
    }

  
    }

