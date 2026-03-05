import java.util.*;
public class TicTacToe 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        //this will become createBoard
        char[][] board = new char[3][3];
        //fill with _ for blank spots
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                board[i][j] = '_';
            }
        }

        //count how many moves have been made
        int moves = 0;
        //keep track of whose turn it is
        char turn = 'X';

        //print the initial board
        //this will become printBoard
        System.out.println("Current board: ");
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.printf("%c ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //keep playing while less than 9 moves
        //instead, loop while puzzle isn't full
        while (moves < 9) {
            //this becomes getRow
            System.out.printf("%c, enter row: ", turn);
            int row = s.nextInt();

            //this becomes getCol
            System.out.printf("%c, enter column: ", turn);
            int col = s.nextInt();

            //check to see if that is a valid move
            if (row < 0 || row > 2 || col < 0 || col > 2) 
            {
                System.out.println("Invalid row/column");
            }
            else if (board[row][col] != '_') 
            {
                System.out.println("That spot is taken");
            }
            else 
            {
                //it was a good move
                board[row][col] = turn;

                //print the board
                //this will become printBoard
                System.out.println("Current board: ");
                for (int i = 0; i < 3; i++) 
                {
                    for (int j = 0; j < 3; j++) 
                    {
                        System.out.printf("%c ", board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();

                //check for a winner
                //this will become winner
                boolean win = false;
                for (int i = 0; i < 3; i++) 
                {
                    //found 3 on a row
                    if (board[i][0] == board[i][1] &&
                    board[i][1] == board[i][2] &&
                    board[i][0] == turn) win = true;

                    //found 3 on a column
                    if (board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i] &&
                    board[0][i] == turn) win = true;
                }

                //found 3 on a \ diagonal
                if (board[0][0] == board[1][1] &&
                board[1][1] == board[2][2] &&
                board[0][0] == turn) win = true;

                //found 3 on a / diagonal
                if (board[2][0] == board[1][1] &&
                board[1][1] == board[0][2] &&
                board[2][0] == turn) win = true;

                if (win) 
                {
                    System.out.printf("%c wins!%n", turn);
                    //end the game
                    break;
                }

                //switch whose turn it is
                if (turn == 'X') turn = 'O';
                else turn = 'X';

                //increment number of moves
                moves++;
            }
        }

        //if moves made it to 9, must be a tie
        if (moves == 9) System.out.println("Tie game.");
    }
}