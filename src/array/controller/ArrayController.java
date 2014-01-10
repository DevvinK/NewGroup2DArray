package array.controller;

import array.model.Dogs;

public class ArrayController
{
	private ArrayController baseController;
	private String [][] baseStringArray;
	private Dogs [][] groupArray;
	private int [][] baseIntArray;
	
	
	public void start()
	{
		
	}
	
	public ArrayController()
	{
		baseStringArray = new String[4][4];
		groupArray = new Dogs[6][4];
		baseIntArray = new int[5][3];
	}
	
	private void addToDogs()
	{
		for(int row= 0; row < groupArray.length; row++)
		{
			for(int col=0; col < groupArray[0].length;col++)
			{
				groupArray [row][col] = new Dogs();
				
			}
		}
	}
}
