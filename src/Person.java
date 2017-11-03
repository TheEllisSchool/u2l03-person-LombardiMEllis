import java.awt.Color;
import java.awt.Graphics;

public class Person {
	//attributes
	private Color eyeColor;
	private Color hairColor;
	private int height; //pixels
	private int x;  //top of body
	private int y;  //top of body
	
	
	//methods
	
	//constructor
	public Person (Color ec, Color hc, int h, int xin, int yin) {
		eyeColor = ec;
		hairColor = hc;
		height = h;
		x = xin;
		y = yin;
	}


	public void show(Graphics g) {
		//body
		g.setColor(Color.BLACK);
		g.drawLine(x, y, x, y + height - 50);
		//legs
		g.drawLine(x, y + height - 50, x - 30, y + height);
		g.drawLine(x, y + height - 50, x + 30, y + height);
		//arms
		g.drawLine(x, y + (height - 50)/2, x - 15, y + (height - 50)/2);
		g.drawLine(x, y + (height - 50)/2, x + 15, y + (height - 50)/2);
		
		//head
		g.fillOval(x - 40, y - 100, 80, 100);
	}
	
	
	
	
}
