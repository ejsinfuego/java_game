package colorGame;

import java.util.Random;

public class colorCuber {
	
	String colors[]; 
	
	public String[] addColors(String newColors[]){
		
		colors= newColors;
		return colors;
		
	}
	public static String rollCube() {
		
		int j = 3;
		String colorsWon[] = new String[3];
		for(int i = 0; i < j; i++) {
			int min = 1;
			int max = 6;
			String colors[] = {"White", "Blue", "Green", "Red", "Black", "Yellow"}; 
			Random random = new Random();
			int x = (int)(Math.random()*(max-min+1)+min);
			String result = colors[x];
			colorsWon[i] =result;
	
		}String winningColors = colorsWon[0]+ " " + colorsWon[1] + " " + colorsWon[2];
		return winningColors;
	
		}
}
	
