import java.util.Scanner;
import java.io.IOException;
class Game {
	private static Coin n = new GameCoin();
	private static int input;
	private static Scanner cin = new Scanner(System.in);
	private static boolean isNumber;
	public static void cls() {
		try {
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String args[]) {
		try {
			while (true) {
				System.out.println("Enter 1.Toss Coin\t2.exit->");
				do {
					if(cin.hasNextInt()) {
						input = cin.nextInt();
						cls();
						isNumber = true;
					} else {
						cls();
						System.out.println("invalid input");
						System.out.println("Enter 1.Toss Coin\t2.exit->");
						cin.next();
					}
				} while(!isNumber);
				if(input == 1) {
					n.toss();
					n.show();
				} else if (input == 2) {
					System.exit(0);
				} else {
					System.out.println("invaid input");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}