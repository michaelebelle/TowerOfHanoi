                                                   public class TowerOfHanoi 
{
	private Pole[] poles; 
	private int maxNumdisks;
	public TowerOfHanoi()
	{
		maxNumdisks = 7;
		poles = new Pole [3];
		for(int i = 0; i < poles.length; i++)
		{
			poles [i] = new Pole (7);
		}
		for(int i = 0; i < maxNumdisks; i++)
			
		{
			Disk disks = new Disk (maxNumdisks-i);
			poles[0].addDisk(disks);
		}
	}
	public TowerOfHanoi(int aNumberOfDisks)
	{
		
		if (aNumberOfDisks < 1)
		{
			aNumberOfDisks = 1;
		}
		maxNumdisks = aNumberOfDisks;
		poles = new Pole [3];
		for(int i = 0; i < poles.length; i++)
		{
			poles [i] = new Pole (maxNumdisks);
		}
		for(int i = 0; i < maxNumdisks; i++)
			
		{
			Disk disks = new Disk (maxNumdisks-i);
			poles[0].addDisk(disks);
		}
	}
	public Disk peekTopDisk(int aPoleNumber)
	{
		if(aPoleNumber == 1 || aPoleNumber == 2 ||aPoleNumber == 3)
			return poles[aPoleNumber-1].peekTopDisk();
		else
			return null;
	}
	public int getNumberOfDisks(int aPoleNumber)
	{
		if(aPoleNumber == 1 || aPoleNumber == 2 ||aPoleNumber == 3)
			return poles[aPoleNumber-1].getNumberOfDisks();
		else
			return -1;
	}
	public String toString()
	{
		String results = "";
		String a = poles[0].toString() +"\n" + poles[1].toString() + "\n"+ poles[2].toString();
		String [] poledisk = a.split("\n");
		for (int b = 0; b < maxNumdisks; b++)
		{
			results += " ";
		}
		results += "1"; 
		for (int c = 0; c < maxNumdisks*2 + 1; c++)
		{
			 results += " ";
		}
		results += "2"; 
		for (int d = 0; d < maxNumdisks*2 + 1; d++)
		{
			 results += " ";
		}
		results += "3" + "\n"; 
		for(int i = 0; i < poledisk.length/3; i++)
		
		{
			results += poledisk[0*(maxNumdisks+1)+i] +" " + poledisk[1*(maxNumdisks+1)+i] + " " + poledisk[2*(maxNumdisks+1)+i] + "\n";
		}
		return results;
	}
	public boolean move(int fromPole, int toPole)
	{
		if(poles[fromPole-1].getNumberOfDisks() == 0)
			return false;
		else if (poles[toPole-1].getNumberOfDisks() == poles[toPole-1].getMaxNumberOfDisks())
			return false;
		else 
		{
			Disk diskObject = poles[fromPole-1].removeDisk(); 
			poles[toPole-1].addDisk(diskObject);
			return true;
		}
	}
	public void reset()   
	{
		
		poles = new Pole [3];
		for(int i = 0; i < poles.length; i++)
		{
			poles [i] = new Pole (maxNumdisks);
		}
		for(int i = 0; i < maxNumdisks; i++)
			
		{
			Disk disks = new Disk (maxNumdisks-i);
			poles[0].addDisk(disks);
		}
	}
	}

			

	 