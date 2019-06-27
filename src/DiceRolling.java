import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput;
		int roll1;
		int roll2;
		String again;
		
		
		System.out.println("Welcome to the Grand Circus Casino!");
		
		do {
			System.out.println("How many sides should each die have?");
			userInput = scnr.nextInt();
			
			System.out.println(roll1 = generateRandomDieRoll(userInput));
			System.out.println(roll2 = generatorTwo(userInput));
			
			craps(roll1, roll2);
			
			System.out.println("Roll again? (y/n):");
			again = scnr.next();
			again = again.toLowerCase();
		} while(again.equals("y"));
		
		System.out.println("Goodbye");
		scnr.close();
	}
	
	private static int generateRandomDieRoll(int num) {
		Random rand = new Random();
		num = rand.nextInt(num + 1);
		return num;
	}
	
	//another version
	private static int generatorTwo(int num) {
		num = (int)(Math.random() * num + 1);
		return num;
	}
	
	private static void craps(int x, int y) {
		if(x == 1 && y == 1) {
			System.out.println("Snake Eyes!");
		} else if(x == 6 && y == 6) {
			System.out.println("Box Cars!");
		}
	}

}
