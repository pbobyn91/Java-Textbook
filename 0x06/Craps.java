import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum Status { CONTINUE, WON, LOST };
	
	private static final int snakeEyes = 2;
	private static final int trey = 3;
	private static final int seven = 7;
	private static final int yoLeven = 11;
	private static final int boxCars = 12;
	
	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch (sumOfDice) {
			case seven: 
			case yoLeven:
				gameStatus = Status.WON;
				break;
			case snakeEyes:
			case trey:
			case boxCars:
				gameStatus = Status.LOST;
				break;
			default:
				gameStatus = Status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d%n", myPoint);
				break;
		}
		
		while (gameStatus == Status.CONTINUE){
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			} else if (sumOfDice == seven) {
				gameStatus = Status.LOST;
			}
		}
		
		if (gameStatus == Status.WON) {
			System.out.println("Player wins!!");
		} else {
			System.out.println("Player Lost!!");
		}
	}
	
	public static int rollDice () {
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf("Player rolled %d and %d = %d%n", die1, die2, sum);
		return sum;
	}
}