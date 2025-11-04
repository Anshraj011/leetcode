class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int d[] = new int[n];
        Arrays.fill(d, 1);
        int max = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && d[i] < d[j] + 1) {
                    d[i] = d[j] + 1;
                }
            }
            max = Math.max(max, d[i]);
        }
        return max;
    }
}
