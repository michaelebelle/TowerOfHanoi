import java.util.*;
public final class Pole
{
	// Declare instance variables here.  See toString() method below for names.
	private int numberofDisks; 
	private ArrayList<Disk> disks;
	private int maxNumberofDisk;
	private int maxDiskSize;
	private char poleChar;


	public Pole(int aMaxNumberofDisk, int aMaxDiskSize, char aPoleChar)
	{

		if (aMaxNumberofDisk < 1 )
		{
			aMaxNumberofDisk = 1;
		}
		maxNumberofDisk = aMaxNumberofDisk;
		maxDiskSize = aMaxDiskSize;
		poleChar = aPoleChar;
		disks = new ArrayList<Disk>(maxNumberofDisk);



	}

	public Pole(int aMaxNumberofDisk, int aMaxDiskSize)
	{
		if (aMaxNumberofDisk < 1 )
		{
			aMaxNumberofDisk = 1;
		}

		maxNumberofDisk = aMaxNumberofDisk;

		maxDiskSize = aMaxDiskSize;

		poleChar = '|';

		disks = new ArrayList<Disk>(maxNumberofDisk);



	}

	public Pole(int aMaxNumberofDisk)
	{
		if (aMaxNumberofDisk < 1 )
		{
			aMaxNumberofDisk = 1;
		}
		maxNumberofDisk = aMaxNumberofDisk;
		maxDiskSize = maxNumberofDisk;
		poleChar = '|';
		disks = new ArrayList<Disk>(maxNumberofDisk);
	}

	public int getMaxNumberOfDisks()
	{
		return maxNumberofDisk;
	}

	public int getMaxDiskSize()
	{
		return maxDiskSize;
	}

	public int getNumberOfDisks()
	{
		return disks.size();
	}

	public Disk peekTopDisk()
	{
		if(numberofDisks == 0)
		{
			return null;
		}
		return disks.get(numberofDisks-1);
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();

		
		sb.append("\n");
		for(int i = 0; i < maxNumberofDisk+1; i++)
		{

			if (i >= disks.size())
			{
				
				for (int j = 0; j < maxNumberofDisk; j++)
				{
					
					sb.append(" ");
					
				}
				sb.append("|");

				for (int j = 0; j < maxNumberofDisk; j++)
				{
					sb.append(" ");
				

				}
			


			}
			else 
			{
				for (int j = 0; j < maxNumberofDisk; j++)
				{
					int amountofSpaces = maxDiskSize - disks.get(j).getSize();
					

					String diskString =	disks.get(j).toString();

					diskString = " ".repeat(amountofSpaces) + diskString + " ".repeat(amountofSpaces);

					sb.append(diskString);
					
					
				}	 


			}
			sb.append("\n");
			
			
		}
		String diskString2;
		diskString2 = "=".repeat(maxDiskSize+1) + "=".repeat(maxDiskSize+1);
		sb.append(diskString2);
		return sb.toString();
	}

	public boolean addDisk(Disk aDisk)
	{
		boolean addtheDisk = true;

		if (aDisk.getSize() > maxDiskSize)
		{
			addtheDisk = false;
	
		}

		
			if (disks.size() == maxNumberofDisk)
			{	
				addtheDisk = false;
				
			}

		

		if (addtheDisk)
		{
			disks.add(aDisk);


		}

		return addtheDisk;
			


	}

	public Disk removeDisk()
	{
		boolean remove = true;
		if (disks.size() == 0)
		{
			remove = false;
			return null;
		}
		else 
			{
				Disk newDisk = disks.get(disks.size()-1);
				disks.remove(disks.size()-1);
				return newDisk;
			}

			




	}
		}
	






