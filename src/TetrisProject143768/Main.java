package TetrisProject143768;

public class Main {

	// main method, initiates program and objects in memory, initiated window and
	// GUI stuff
	public static void main(String[] args) {
		// Instantiate necessary objects and GUI and event handling stuff

		// pass execution to title loop method
		titleLoop();
	}

	/**
	 * Method which handles title screen logic title screen --> game --> back again
	 * --> etc.
	 */
	private static void titleLoop() {
		// set up title screen GUI and event handlers for different option selections
		// etc.

		// pass execution to tetris gameplay loop (put this inside event handler
		// eventually)
		// (for now this just default passes through, so a when the program is run a
		// game is auto played)
		gameLoop();
	}

	/**
	 * method that handles the logic of actually playing a game
	 */
	private static void gameLoop() {
		// instantiate all game variable
		int score = 0;
		char nextTetronimo;
		boolean isOver = false; // controls game loop
		boolean won = false; // default lose, set to win in game loop if win.

		// Set up board object
		Board bord = new Board();

		// GAME LOGIC
		while (!isOver) {

		}

		// when game finished, pass execution to final screen method (for GUI purposes)
		finalScreen();
	}

	/*
	 * Method that presents the UI elements and event handlers of the final screen
	 * to the player. like, presenting score list, showing your final score,
	 * allowing you to enter a name for your score and then putting that into a
	 * little database... which is a text file...
	 */
	private static void finalScreen() {
		// init necessary variables

		// read necessary data from txt files

		// GUI stuff

		// user input stuff

		// save data back to txt files

		// close scanners and stuff

		// pass execution depending on player choice
		// play again, back to menu, exit game, etc.

	}
}
