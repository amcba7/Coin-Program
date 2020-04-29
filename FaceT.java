import java.io.BufferedReader;
import java.io.FileReader;
class FaceT implements CoinFace {
	public void print(String line) {
		String [] data = line.split("\n");
		for (String i : data) {
			System.out.println(i);
		}
	}
	public void show() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("State/Tail.txt"));
			for (String i = reader.readLine(); i != null; i = reader.readLine()) {
				print(i);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}