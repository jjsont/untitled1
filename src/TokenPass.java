public class TokenPass {
    public TokenPass(int playerCount) {
        board= new int[playerCount];
        for(int i = 0; i< playerCount; i++) {
            board[i] = i+ (int) (10* Math.random());
        }
        currentPlayer= (int) (playerCount * Math.random());
    }
}

    public void distributeCurrentPlayerTokens() {
    int nextPlayer= currentPlayer;
    int numToDistribute= board[currentPlayer];
    board[currentPlayer]= 0;

    while(numToDistribute > 0) {
        nextPlayer= (nextPlayer + 1) % board.length;
        board[nextPlayer]++;
        numToDistribute--;
    }
}
}
