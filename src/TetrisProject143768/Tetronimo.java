package TetrisProject143768;

import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;  


public class Tetronimo {

	private Coordinate[] coordinate = new Coordinate[4];
	private char color;
	
	//this will be depresiated 
	private Random rand = new Random(System.currentTimeMillis());
	
	public Tetronimo() {
		
		
		
		getRandomTetromino();
	}// end constructor

	private void getRandomTetromino() {
		
		
		int choice = 6;//rand.nextInt(7);
		switch(choice) {
			case 1:
				straight();
				break;
			case 2:
				square();
				break;
			case 3:
				tShape();
				break;
			case 4:
				jShape();
				break;
			case 5:
				lShape();
				break;
			case 6:
				sSkew();
				break;
			case 7:
				zSkew();
				break;
				
		}
		
	}
	//cordinates listed from top right to bottom left.

	private void sSkew() {
		this.color = 'g';
		coordinate[0] = new Coordinate(-1,1);
		coordinate[1] = new Coordinate(0,1);
		coordinate[2] = new Coordinate(0,0);
		coordinate[3] = new Coordinate(1,0);
		
	}
	
	private void zSkew() {
		this.color = 'r';
		coordinate[0] = new Coordinate(0,1);
		coordinate[1] = new Coordinate(1,1);
		coordinate[2] = new Coordinate(-1,0);
		coordinate[3] = new Coordinate(1,0);

	}

	private void jShape() {
		this.color = 'd';
		coordinate[0] = new Coordinate(-1,1);
		coordinate[1] = new Coordinate(-1,0);
		coordinate[2] = new Coordinate(0,0);
		coordinate[3] = new Coordinate(1,0);

	}
	
	private void lShape() {
		this.color = 'o';
		coordinate[0] = new Coordinate(1,1);
		coordinate[1] = new Coordinate(-1,0);
		coordinate[2] = new Coordinate(0,0);
		coordinate[3] = new Coordinate(1,0);

	}

	private void tShape() {
		this.color = 'p';
		coordinate[0] = new Coordinate(0,1);
		coordinate[1] = new Coordinate(-1,0);
		coordinate[2] = new Coordinate(0,0);
		coordinate[3] = new Coordinate(1,0);

	}

	private void square() {
		this.color = 'y';
		coordinate[0] = new Coordinate(0,1);
		coordinate[1] = new Coordinate(-1,0);
		coordinate[2] = new Coordinate(0,0);
		coordinate[3] = new Coordinate(1,0);
	
	}

	private void straight() {
		this.color = 'L';
		coordinate[0] = new Coordinate(-1,0);
		coordinate[1] = new Coordinate(0,0);
		coordinate[2] = new Coordinate(1,0);
		coordinate[3] = new Coordinate(2,0);
	
	}
	
	
	
}
