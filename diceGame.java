package diceGame1;


import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class diceGame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Dice Game!");

		String test = "q";
		
		// Condition whether to start the game or no
		System.out.println("Enter any key to Start or q to Quit: ");
		Scanner keyboard = new Scanner(System.in);
		String x = keyboard.nextLine();
		boolean tried = x.equals(test);
		
			while(tried!=true) {
				int players;
	
				try {
					//This code will ask how many players
					Scanner chooseHowManyPlayers = new Scanner(System.in);
					System.out.println("Choose up to 6 players: ");
					players = chooseHowManyPlayers.nextInt();
					
					if(players <= 6) {
						//Ask a name for each player
						System.out.println("Welcome!");
						//initialize the arrays for players and number of dice got
						String nameOfPlayers[] = new String[6];
						int numberGotfromRoll[] = new int[6];
						
						//for loop to ask each player a name
						for(int i = 0;i < players; i++) {	
							int y = i+1;
							y = y++;
							Scanner askPlayerName = new Scanner(System.in);
							String playerNumber = "P" + y;
							System.out.println("Enter Your Name " + playerNumber + ": ");
							String playerName = askPlayerName.nextLine();
							nameOfPlayers[i]= playerName;
							}
						//Ask the player to roll the dice
						String roll = "no";
						boolean toss = true;
						Scanner askToRoll = new Scanner(System.in);
						System.out.println("Enter 'no' to go back: ");
						String ask = askToRoll.nextLine();
						boolean flag = ask.equals(roll);
						if(toss!=flag){
						//Roll the dice.
							for(int i=0;i<players;i++) {
								System.out.println("\n Rolling the dice......");
								String player = nameOfPlayers[i];												
								int result = Dice.rollDice(1, 6);
								numberGotfromRoll[i] = result;
								System.out.println(nameOfPlayers[i] + " got : " + numberGotfromRoll[i]);
								
								/* This will end the recursion if the player got 6 */
								if(result==6) {
									int max = i;
									String winners = nameOfPlayers[max];
									System.out.println("Winner is " + winners + "\n") ;
									break;
								}else {
									continue;
										
								}
							}
						//Determine the winner							
						int highestNum = numberGotfromRoll[0];
						int count = 1;
						for (int j: numberGotfromRoll) { 
							if(j > highestNum) {	
								count = count++;
								highestNum =findIndex(numberGotfromRoll, j);
								String winnerName = nameOfPlayers[highestNum];
							}		
						}	
						System.out.println("\nWinner is " + nameOfPlayers[highestNum]+ "\n");
						keyboard = new Scanner(System.in);
						System.out.println("Enter s to Start");
						System.out.println("q to quit: ");	
						x = keyboard.nextLine();
						tried = x.equals(test);
						if(x=="q") {
							tried = true;
							System.exit(0);
								}
							}else {
								tried = true;
								}
						}else {
							keyboard = new Scanner(System.in);
							System.out.println("Enter s to Start");
							System.out.println("q to quit: ");	
							x = keyboard.nextLine();
							tried = x.equals(test);
							if(x=="q") {
								tried = true;
								System.exit(0);
									}
								}
					}
					//If the player did not enter a number this code will execute.
					catch(Exception e) {
						System.out.println("Please enter a number");
						keyboard = new Scanner(System.in);
						System.out.println("Enter s to Start");
						System.out.println("q to quit: ");	
						x = keyboard.nextLine();
						tried = x.equals(test); //flag to determine if the player enter q or not
						if(x=="q") {
							tried = true;
							System.exit(0);
								}
						}
					}
			System.exit(0);
			
	}
	
	
	 public static int index(int arr[], int t, int start)
	    {
	          
	        // base number 
	        // start equals the length of the 
	        // array we return -1
	        if(start==arr.length)
	            return -1;
	          
	        // if element at index start equals t
	        // we return start
	        if(arr[start]==t)
	            return start;
	          
	        // we find for the rest
	        // position in the array
	        return index(arr,t,start+1);
	    }
	    public static int findIndex(int arr[], int t)
	    {
	        return index(arr,t,0);
	    }

	    public class Dice {
	    	
	    	int min;
	    	int max;
	    	
	    public static int rollDice(int min, int max) {
	    		
	    		Random random = new Random();  
	    		int b = (int)(Math.random()*(max-min+1)+min); 
	    		return b;
	    		
	    	}
	    	
	
}
}