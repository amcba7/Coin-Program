class GameCoin extends AbstractCoin {
	private CoinFace [] face = {new FaceT(), new FaceH()};
	public void show() {
		if (getSide()=='H') {
			face[1].show();
			System.out.println("\t\t\tHead");
		} else if (getSide() == 'T') {
			face[0].show();
			System.out.println("\t\t\tTail");
		} else {
			System.out.println("invaid input");
		}
	}
}