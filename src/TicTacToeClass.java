public class TicTacToeClass {

    // reference to a board
    private char[][] board;

    // what variables is it tracking
    private int turns;

    public TicTacToeClass() {
        // 3 x 3 board
        board = new char[3][3];
        // number of turns starts at zero
        turns = 0;

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = ' ';
            }
        }
    }

    // check to see if player is the winner of the game
    public boolean isWinner(char player) {

        // horizontal
        // diagnal
        // vertical

        return false;
    }

    // check if turns is equal to nine
    public boolean isFull() {
        return turns == 9;
    }

    // check if turns is equal to 9 and neither X or O is won
    public boolean isCat() {
        return turns == 9
                && !(isWinner('X'))
                && !(isWinner('O'));
    }

    public boolean isValid(int row, int column) {
        // check the scope of the rows and columns
        if (0 <= row
                && row <= 2
                && 0 <= column
                && column <= 2) {
            return true;
        }
        return false;
    }
}
