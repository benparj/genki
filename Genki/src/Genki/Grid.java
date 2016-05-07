package connect4;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Cell[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
		setSize(rows,cols);
	}

	public void setSize(int rows, int cols)
	{
		grid = new Cell[rows][cols];
	}

	public void setSpot(int row,int col, Cell val)
	{
		grid[row][col] = val;
	}
	
	public Cell getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		return grid[0].length;
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
		
		//for loop for row
		for(int a = 0; a<grid.length; a++)
		{
		
			//for loop for col
			for(int b = 0; b<grid[0].length; b++)
			{
				//get current Cell
				//if it is null
				if(grid[a][b]!=null)
				{
					grid[a][b].draw(window);
				}
				//else
				else
				{
					full = false;
				}
			}

		}
		return full;
	}
	
	public String toString()
	{
		String output="";
		for(int a = 0; a<grid.length; a++)
		{
			for(int b = 0; b<grid[0].length; b++)
			{
				if(grid[a][b]==null)
				{
					output+="null ";
				}
				else
				{
					output+=grid[a][b].toString() + " ";
				}
			}
		}
		return output;
	}
}