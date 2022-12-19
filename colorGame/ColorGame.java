package colorGame;

import java.util.Random;
import java.util.Scanner;

public class ColorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Start the game.
		System.out.print("Welcome to Dice Game \n \n Created by: undie-ying \n");
		Scanner getInput = new Scanner(System.in);
		String quit = "q";
		System.out.println("Enter any key to play, q to quit: \n");
		String x = getInput.nextLine();
		//Condition if the user enter quit the program will end.
		boolean flag = x.equals(quit); 
		//While loop to continue the program until the user enter quit q, or no
			
			while(!flag){
				
				try{
							
							 System.out.println("Choose your color among: \n"
							 		+ "White Green Blue Red Black Yellow");
							 System.out.println("\nEnter any key to roll the cubes or n to q");
							 Scanner askToRoll = new Scanner(System.in);
							 String ask = askToRoll.nextLine();
							 String ref = "q";
							 boolean check = ask.equals(ref);
							 
						 //Roll the dice
							 if(!check){
								 String colorResult = colorCuber.rollCube();	
								 System.out.println("The winning colors are: \n" + colorResult);
								 //Ask if they will play again
								 System.out.println("\nPress enter to continue playing or enter q to quit");
								 askToRoll = new Scanner(System.in);
								 ask = askToRoll.nextLine();
								 ref = "q";
								 flag = ask.equals(ref);
								 }
							 else {
								 //exit if the the user enter q
								 System.out.println("Goodbye!");
								 flag = true;
							 	  }
						
						 }
				
				catch(Exception e){ 
				}
				finally {
		
					 flag = false;
				}
				
			}System.out.println("Goodbye!");
			getInput.close();
	}
	
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
}

