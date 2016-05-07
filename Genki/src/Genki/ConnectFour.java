package connect4;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;

public class ConnectFour extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public ConnectFour()
	{
		super("CONNECT FOUR");
		setSize(WIDTH,HEIGHT);
						
		getContentPane().add(new GameBoard());
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		ConnectFour run = new ConnectFour();
	}
}