package TetrisProject143768;

public class Block {
	// declare block vars
	// color can have value set as l = light blue, y = yellow, p = pink, d = dark
	// blue, o = orange, g = green, r = red, e = empty
	private char color;

	// Constructor for block
	public Block(char colorChoice) {
		color = colorChoice;

	}

	// getter for GUI to use
	public char getColor() {

		return this.color;
	}
}
