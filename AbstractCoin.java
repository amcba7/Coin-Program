import java.util.Random;
abstract class AbstractCoin implements Coin {
	private Random rand = new Random();
	private char side;
	public AbstractCoin() {
		toss();
	}
	public char getSide() {
		return side;
	}
	public void toss() {
		side = rand.nextBoolean() ? 'H' : 'T';
	}
	public String toString() {
		return "" + side;
	}
}