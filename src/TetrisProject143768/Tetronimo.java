package TetrisProject143768;

import java.util.Random;

public class Tetronimo {

	private Block[][] tetromino = new Block[4][4];
	
	private Random rand = new Random(System.currentTimeMillis());
	
	public Tetronimo() {
		//initialize array
		for(int y = 0;y< tetromino[0].length; y++) {			
			for(int x = 0;x< tetromino.length; x++) {
				tetromino[x][y] = new Block("Empty");
				}}
		
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

	private void sSkew() {
		int x = 0;
		int y = 0;
		
		tetromino[0+x][0+y] = new Block("Red");
		tetromino[1+x][0+y] = new Block("Red");
		tetromino[3+x][1+y] = new Block("Red");
		tetromino[2+x][1+y] = new Block("Red");
		
	
	}
	
	private void zSkew() {
		int x = 0;
		int y = 0;
		
		tetromino[2+x][0+y] = new Block("Green");
		tetromino[3+x][0+y] = new Block("Green");
		tetromino[0+x][1+y] = new Block("Green");
		tetromino[1+x][1+y] = new Block("Green");
		
	}

	private void jShape() {
		int x = 0;
		int y = 0;
		
		tetromino[0+x][0+y] = new Block("Orange");
		tetromino[0+x][1+y] = new Block("Orange");
		tetromino[1+x][0+y] = new Block("Orange");
		tetromino[2+x][0+y] = new Block("Orange");
		tetromino[3+x][0+y] = new Block("Orange");
		
	}
	
	private void lShape() {
		int x = 0;
		int y = 0;
		
		tetromino[0+x][0+y] = new Block("Blue");
		tetromino[1+x][0+y] = new Block("Blue");
		tetromino[2+x][0+y] = new Block("Blue");
		tetromino[3+x][0+y] = new Block("Blue");
		tetromino[3+x][1+y] = new Block("Blue");
		
	}

	private void tShape() {
		int x = 0;
		int y = 0;
		
		tetromino[0+x][1+y] = new Block("Pink");
		tetromino[1+x][1+y] = new Block("Pink");
		tetromino[1+x][2+y] = new Block("Pink");
		tetromino[2+x][1+y] = new Block("Pink");
		
	}

	private void square() {
		int x = 0;
		int y = 0;
		
		tetromino[0+x][0+y] = new Block("Yellow");
		tetromino[0+x][1+y] = new Block("Yellow");
		tetromino[1+x][0+y] = new Block("Yellow");
		tetromino[1+x][1+y] = new Block("Yellow");
		
		
	}

	private void straight() {
		//cyan
		int x = 0;
		int y = 0;
		
		tetromino[0+x][0+y] = new Block("Cyan");
		tetromino[1+x][0+y] = new Block("Cyan");
		tetromino[2+x][0+y] = new Block("Cyan");
		tetromino[3+x][0+y] = new Block("Cyan");
		
		

	}
	//this method is only for debugging!!!
	private void Tester() {
		
		for(int y = 0;y< tetromino[0].length; y++) {
			
			for(int x = 0;x< tetromino.length; x++) {
				String temp = tetromino[x][y].getColor();
				if(x==3) {
					temp+= "\n";
				}
				else {
					temp+= "\t";
				}
				System.out.print(temp);
			}// end inner loop
		}//end outter loop
	}//end method
	
	
}
