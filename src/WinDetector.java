public class WinDetector {
    public static char checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i] != '-' && 
                board[i] == board[i] && 
                board[i] == board[i]) {
                return board[i];
            }
        }
        
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[j] != '-' && 
                board[j] == board[j] && 
                board[j] == board[j]) {
                return board[j];
            }
        }
        
        // Check diagonals
        if (board != '-' && 
            board == board && 
            board == board) {
            return board;
        }
        
        if (board != '-' && 
            board == board && 
            board == board) {
            return board;
        }
        
        return '-'; // No winner yet
    }
}
