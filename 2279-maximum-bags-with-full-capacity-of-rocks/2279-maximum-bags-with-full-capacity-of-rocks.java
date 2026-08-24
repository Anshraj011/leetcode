class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n= rocks.length;
        int[] diff = new int[n];

        for (int i = 0; i < n; i++) {
            diff[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(diff);

        int sum = 0;
        int count = 0;

        for (int x : diff) {
            if (sum + x > additionalRocks)
                break;

            sum += x;
            count++;
        }
        return count;
    }
}