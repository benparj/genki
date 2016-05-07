package connect4;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Piece extends Cell
{
	private Color color;
	
	public Piece()
	{
		super(5,5,5,5);
	}

	public Piece(int x, int y, int w, int h, Color c)
	{
		super(x,y,w,h);
		setColor(c);
	}


	public void setColor(Color c)
	{
		color = c;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public void draw(Graphics window)
	{
		window.setColor(getColor());
		window.fillOval(getX(), getY(), getWidth(), getHeight());
	}
	
	public String toString()
	{
		return super.toString() + " " + getColor();
	}
}