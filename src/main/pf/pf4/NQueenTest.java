package main.pf.pf4;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class NQueenTest {
	private NQueenProblem queens = null;
	@Before
	public void executedBefore() {
		queens = new NQueenProblem();
	}
	@Test
	public void testNQueenProblem1() {
		int dimension = 4;
		int resultantOutput[][] = new int[dimension][dimension];
		int board[][] = { { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0} };
		int expectedOutput[][] = { { 0,  0,  1,  0},
									{1,  0,  0,  0},
									 { 0,  0,  0,  1},
						              { 0,  1,  0,  0}};
		int col = 0;
		if(queens.boardSolver(board, col, dimension)){
			resultantOutput = board;
			assertArrayEquals(expectedOutput, resultantOutput);
		}
	}
	@Test
	public void testNQueenProblem2() {
		int dimension = 5;
		int resultantOutput[][] = new int[dimension][dimension];
		int board[][] = { { 0,  0,  0,  0, 0},
	              { 0,  0,  0,  0, 0},
	              { 0,  0,  0,  0, 0},
	              { 0,  0,  0,  0, 0},
	              { 0,  0,  0,  0, 0}};
		int expectedOutput[][] = { { 1,  0,  0,  0, 0},
									{0, 0,  0,  1,  0},
									 { 0,  1,  0,  0, 0},
						              { 0,  0,  0,  0, 1},
						              {0 , 0, 1, 0, 0}};
		int col = 0;
		if(queens.boardSolver(board, col, dimension)){
			resultantOutput = board;
			assertArrayEquals(expectedOutput, resultantOutput);
		}
	}

}
