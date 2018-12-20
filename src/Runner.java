public class Runner {
    public static void main(String[] args) {
        while(game1.gameOver()<0) {
            game1.printBoard();
            game1.distributeCurrentPlayerTokens();
            game1.nextPlayer();
        }
    }
    game1.printBoard();
    System.out.println("Game Winner: Player ") + game1.gameOver());
}
