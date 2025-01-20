class Solution {
    public int orangesRotting(int[][] grid) {
        // number of rows
        int m = grid.length;
        // number of columns
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        // variable to hold the fresh orange count
        int fresh = 0;
        // Loop to add rotten orange grid index to the queue and count the fresh oranges
        for (int i=0; i < m; i++) {
            for (int j=0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        // If zero fresh oranges, then return 0
        if (fresh == 0) return 0;
        // If zero rotten oranges then return -1
        if (q.size() == 0) return -1;
        // To check 4 neigbors of grid element
        int[] nrow = {1, 0, -1, 0};
        int[] ncol = {0, -1, 0, 1};
        int minute = 0;

        while (!q.isEmpty()) {
            minute++;
            int size = q.size();
            while (size-- > 0) {
                int x = q.peek()[0];
                int y = q.peek()[1];
                q.remove();

                for (int i=0; i<4; i++) {
                    int row = x + nrow[i];
                    int col = y + ncol[i];

                    if (row >= 0 && row < m && col >=0 && col < n && grid[row][col] == 1 ) {
                        fresh--;
                        grid[row][col] = 2;
                        q.offer(new int[]{row, col});
                    }
                }
            }
        }
        if(fresh > 0) return -1;
        return minute==0?0:minute-1;
    }
}