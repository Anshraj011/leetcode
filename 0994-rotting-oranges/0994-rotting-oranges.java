class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshCount = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] {i, j});
                }
                if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }
        
        if (freshCount == 0) return 0;
        if (queue.isEmpty()) return -1;
        
        int time = -1;
        int[][] directions = {{1, 0}, {-1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];
                
                for (int[] dir : directions) {
                    int newRow = row + dir[0];
                    int newCol = col + dir[1];
                    
             if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        freshCount--;
                        queue.offer(new int[] {newRow, newCol});
                    }
                }
            }
            time++;
        }
        
        return freshCount == 0 ? time : -1;
    }
}
