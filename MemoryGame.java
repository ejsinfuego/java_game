package memoryGame;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class MemoryGame {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Memory Game! \n \n");
		String instruction = "-Instruction- \nThere is a stone in one of the 3 upside down cups\n"
				+ "It will be shuffled and your task is to know where is the stone among the 3 cups";
		System.out.println(instruction);
		
		System.out.println("Enter any key to start shuffling, q to quit");
		String quit = "q";
		Scanner start = new Scanner(System.in);
		String q = start.nextLine();
		boolean ref = q.equals(quit);
		
		System.out.println("Enter your name: ");
		start = new Scanner(System.in);
		String name = start.nextLine();
		Player player = new Player();
		player.addName(name);
		
		System.out.println("Hello, " + player.name + "\nStart the game by entering any key, q to quit\n" );
		start = new Scanner(System.in);
		q = start.nextLine();
		ref = q.equals(quit);

		
		while(!ref) {
			
			try{
				
				int cups = 3;
				int[] answers = new int[3];
				int[] numberShowing = new int[3];
				for(int j = 1;j<=cups;j--) {
					numberShowing[j] = showNumbers();
					System.out.println("Shuffling.....");
					System.out.println("your guess is cup: ");
			
						
						Scanner answer= new Scanner(System.in);
						int ans = answer.nextInt();
						answers[j] = ans;
						if(answers[j]!=numberShowing[j]){
							System.out.println("Wrong!");
							System.out.println("Press enter key to shuffle the cups again or q to quit");
							start = new Scanner(System.in);
							q = start.nextLine();
							ref = q.equals(quit);
							}else{
							System.out.println("Correct!");
							System.out.println("Press enter key to shuffle the cups again or q to quit");
							start = new Scanner(System.in);
							q = start.nextLine();
							ref = q.equals(quit);
							continue;
							}
						}
					}	
			
			  catch(Exception e){
				  System.out.println("Error, Make sure to put correct number from 1-3");
				  System.out.println("Press enter key to shuffle the cups again or q to quit");
				  start = new Scanner(System.in);
				  q = start.nextLine();
				  ref = q.equals(quit);
				  continue;
				  				}
		}
	}
	
	public static int showNumbers() {
	
		int number;
		int min  = 1;
		int max = 3;
		
			Random random = new Random();
			number = ((int)(Math.random()*(max-min+1)+min)); 

		return number;
		}
	
	
}


