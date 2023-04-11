package java_Development;

import java.util.Random;
import java.util.Scanner;

class Game1 {
	public int inputNumber;
	public int nooffguess = 0;
	public int number;

	public int getNooffguess() {
		return nooffguess;
	}

	public void setNooffguess(int nooffguess) {
		this.nooffguess = nooffguess;
	}

	Game1() {
		Random r = new Random();
		number = r.nextInt(100);
	}

	void takeUserInput() {
		System.out.println("Guess the number:");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}

	boolean iscorrectnumber() {
		nooffguess++;
		if (inputNumber == number) {
			System.out.format("You are choose the correct number ,it was %d\nyou guess in %d attempt.", number,
					nooffguess);
			return true;
		} else if (inputNumber < number) {
			System.out.println("Too low...");
		} else if (inputNumber > number) {
			System.out.println("Too high...");
		}
		return false;
	}
}

public class Number_guessing_game {
	public static void main(String[] args) {
		System.out.println("User guess the number between 1 to 100 : ");
		Game1 g = new Game1();
		boolean b = false;
		while (!b) {
			g.takeUserInput();
			b = g.iscorrectnumber();
		}
	}
}
