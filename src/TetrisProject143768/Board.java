package TetrisProject143768;

public class Board {
	// board vars
	// board declared but not initialized
	private char[][] board;
	// Static constant vars so we only need to change them in one place, right here
	// also so we don't have to do a array.length check which takes up valuable
	// processor time.
	private static int BOARDWIDTH = 10;
	private static int BOARDHEIGHT = 20;

	// constructor
	public Board() {
		// init board
		board = new char[BOARDHEIGHT][BOARDWIDTH];
		// initialize array
		for (int y = 0; y < BOARDWIDTH; y++) {
			for (int x = 0; x < BOARDHEIGHT; x++) {
				board[x][y] = 'e';
			}
		}
	}

	// getters and setters
}
