public class TokenPass {
    private int[] board;
    private int currentPlayer;
    private int playerCount;

    public TokenPass(int[] board, int currentPlayer, int playerCount) {
        this.board = board;
        this.currentPlayer = currentPlayer;
        this.playerCount = playerCount;

    }


    public TokenPass(int playerCount) {
        board = new int[playerCount];
        for (int i = 0; i < playerCount; i++) {
            board[i] = i + (int) (10 * Math.random());
        }
        currentPlayer = (int) (playerCount * Math.random());
    }

    public void distributeCurrentPlayerTokens() {
        int nextPlayer = currentPlayer;
        int numToDistribute = board[currentPlayer];
        board[currentPlayer] = 0;
        while (numToDistribute > 0) {
            nextPlayer = (nextPlayer + 1) % board.length;
            board[nextPlayer]++;
            numToDistribute--;
        }
    }

    public void printBoard() {
        String pew = "";
        for (int i = 0; i < playerCount; i++) {
            pew = ("Player " + i + ";" + board[i]);
        }
        System.out.println(pew);
    }

    public void nextPlayer() {
        currentPlayer++;
    }

    public int gameOver() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] <= 0) {
                return i;
            }
        }
        return board.length - 1;
    }
}



}
