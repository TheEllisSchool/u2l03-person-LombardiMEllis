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
	
	//set x
	public void setX (int inx) {
		if (inx > 0 && inx < 500) {
			x = inx;
		} else {
			System.out.println("x out of bounds, x set to 10");
			x = 10;
		}	
	}
	
	//get x
	public int getX() {
		return x;
	}
	
	public void walk() {
		int tempX = x;
		tempX += 10;
		setX(tempX);
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
		
		//hair
		g.setColor(hairColor);
		g.fillOval(x, y - 100, 100, 100);
		g.setColor(Color.PINK);
		g.fillOval(x, y - 80, 100, 100);
		//head
		g.setColor(Color.BLACK);
		g.fillOval(x - 40, y - 100, 80, 100);
		//eyes
		g.setColor(eyeColor);
		g.fillOval(x - 10, y - 50, 10, 10);
		g.fillOval(x + 10, y - 50, 10, 10);
		
		
	}
	
	//toString method (override method)
	public String toString() {
		String sentence = "Eye Color: " + eyeColor + "\nHair Color: " + hairColor
				+ "\nHeight: " + height + "\nLocation: (" + x + ", " + y + ")";
		return sentence;
	}
	
	
	
	
}
