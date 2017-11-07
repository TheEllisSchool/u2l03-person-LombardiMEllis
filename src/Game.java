import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Game extends DrawableAdapter {
	
	static Game ga = new Game();
	static GameBoard gb = new GameBoard(ga, "Person");
	
	static Color BROWN = new Color(142, 64, 4);
	
	static Person mrsLombardi = new Person(Color.GREEN, BROWN, 300, 100, 150);
	static Person leah = new Person(Color.CYAN, BROWN, 250, 400, 150);
	
	public static void main(String[] args) throws InterruptedException {
		showGameBoard(gb);
		
		System.out.println(mrsLombardi);
		
		//System.out.println(mrsLombardi.getX());
		//mrsLombardi.setX(1000);
		//System.out.println(mrsLombardi.getX());
		
		for (int i = 0; i < 70; i++) {
			mrsLombardi.walk();
			leah.walk();
			TimeUnit.SECONDS.sleep(10);
		}
		
	}
	
	public void draw(Graphics g) {
		mrsLombardi.show(g);
		leah.show(g);
	}

}
