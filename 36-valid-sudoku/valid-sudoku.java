class Solution {
    HashSet foundNumbers = new HashSet<>();
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    if (!foundNumbers.add(i + " row " + board[i][j])) {
                    return false;
                }
                if (!foundNumbers.add(j + " column " + board[i][j])) {
                    return false;
                }
                int box_number = ((i/3)*3) + (j/3);
                if (!foundNumbers.add(box_number + " box_num " + board[i][j])) {
                    return false;
                }
                }
            }
        }
        return true;
    }
}