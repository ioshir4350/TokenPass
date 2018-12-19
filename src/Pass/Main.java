package Pass;

public class Main {

    public static void main(String[] args) {
        TokenPass testGame = new TokenPass(10);
        int [] testBoard = testGame.getBoard();
        for (int i = 0; i < testBoard.length; i++)
        {
            System.out.print(testBoard[i]+" ");
        }
        System.out.println();

        testGame.distributeCurrentPlayerTokens();
        System.out.print("After distributing tokens from player " +testGame.getCurrentPlayer()+": ");
        for (int i = 0; i<testBoard.length; i++)
        {
            System.out.print(testBoard[i]+ " ");
        }
    }
}

