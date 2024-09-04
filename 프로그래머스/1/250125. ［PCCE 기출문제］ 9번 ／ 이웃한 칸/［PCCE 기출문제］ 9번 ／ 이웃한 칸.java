class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        if (h > 0) {
            if (board[h][w].equals(board[h - 1][w])) 
                answer++;
        }
        if (w > 0) {
            if (board[h][w].equals(board[h][w - 1])) 
                answer++;
        }
        if (h < board.length - 1) {
            if (board[h][w].equals(board[h + 1][w])) 
                answer++;
        }
        if (w < board[0].length - 1) {
            if (board[h][w].equals(board[h][w + 1])) 
                answer++;
        }
        
        return answer;
    }
}