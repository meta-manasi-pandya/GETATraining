package main.pf.pf4;

/**
 * Class name-NQueenProblem
 * 
 * @version 1.0
 * @author Manasi Pandya
 * Assignment - 3
 */
public class NQueenProblem {
	 /**
	 * A function to check if a queen can
     * be placed on board[row][col]. This
     * function is called when "col" queens are already
     * placed in columns from 0 to col -1. So we need
     * to check only left side for attacking queens
	 * @param board
	 * @param row
	 * @param col
	 * @param dimension
	 * @return True or False
	 */
    public boolean isCorrect(int board[][], int row, int col, int dimension){
        int i, j;
 
        // Check this row on left side
        for (i = 0; i < col; i++){
            if (board[row][i] == 1){
                return false;
            }
        }
 
        // Check upper diagonal on left side 
        for (i=row, j=col; i>=0 && j>=0; i--, j--){
            if (board[i][j] == 1){
                return false;
            }
        }
 
        // Check lower diagonal on left side
        for (i=row, j=col; j>=0 && i<dimension; i++, j--){
            if (board[i][j] == 1){
                return false;
            }
        }
         return true;
    }
 
    // A recursive function to solve NQueen problem
    public boolean boardSolver(int board[][], int col, int dimension){
        //If all queens are placed then return true
        if (col >= dimension){
            return true;
        }
 
        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < dimension; i++){
            if (isCorrect(board, i, col, dimension)){
                board[i][col] = 1;
 
                // recur to place rest of the queens
                if (boardSolver(board, col + 1, dimension) == true){
                    return true;
                }
                board[i][col] = 0; // Backtrack
            }
        }
        return false;
    }
}
