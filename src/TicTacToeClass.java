public class TicTacToeClass {
    
    // reference to a board
    private char [][] board;


    //what variables is it tracking
    private int turns;

    public TicTacToeClass(){
        // 3 x 3 board
        board = new char[3][3];
        // number of turns starts at zero
        turns = 0;

        for( int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column ++){
                board[row][column] = ' ';
            }
        }
    }

    // check to see if player is the winner of the game
    public boolean inWinner( char player){
        

        //horizontal 
        //diagnal
        //vertical
        
        return false;
    }
    
}
