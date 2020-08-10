public final class Disk
{
	// Declare instance variables here.  See toString() method below for names.
	private int diskSize;
	private char diskChar;
	private char poleChar;
	private String diskString;

	public Disk(int aDiskSize, char aDiskChar, char aPoleChar)
	{
		diskSize = aDiskSize;
		diskChar = aDiskChar;
		poleChar = aPoleChar;
		diskString = "";

		for (int i = 1; i <= diskSize; i++)
		{
			diskString += diskChar;
		}
		
			diskString += poleChar;

		for (int i = 1; i <= diskSize; i++)
		{
			diskString += diskChar;
					
		}
	}

	public Disk(int aDiskSize)
	{
		diskSize = aDiskSize;
		diskChar = '*';
		poleChar = '|';
		diskString = "";

		if (diskSize <= 0 )
		{
			diskSize = 1;
		}

		for (int i = 1; i <= diskSize; i++)
		{
			diskString += diskChar;
		}
		
			diskString += poleChar;

		for (int i = 1; i <= diskSize; i++)
		{
			diskString += diskChar;
					
		}

	}

	public int getSize()
	{
		return diskSize;
	}

	
	public String toString()
	{
		return diskString;
	}

	

	

}