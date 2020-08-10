import java.util.*;
public class TOH
{

	public static void main(String [] args)
	{
		String ready = "";
		int answer;
		Scanner inScan = new Scanner(System.in);
		int amountofdisks;
		double goal;
		int moves = 0;
		String usermove;
		double goal1;
		int d; 
		int p;
		int amountofdisks2;
		boolean game = true;
		int total;
		

		do 
		{
			System.out.println("Welcome to Tower of Hanoi Puzzle");
			System.out.println("Take a pick:");
			System.out.println("	1) Play a Tower of Hanoi Puzzle");
			System.out.println("	2) Exit");
			answer = inScan.nextInt();

			
			if (answer == 2)
			{
				break;
			}

			System.out.println("How many disks would you like to play? (Between 1 and 64)");
			amountofdisks = inScan.nextInt();
			total = getTotalOfDisks(amountofdisks);

			goal = Math.pow(2, amountofdisks);
			goal1 = goal - 1;


			if (amountofdisks >= 1 && amountofdisks <= 64)
			{	

			TowerOfHanoi toh = new TowerOfHanoi(amountofdisks);
			System.out.println(toh);
			System.out.println("The goal is to move all " + amountofdisks + " disks from pole 1 to pole 3");
			System.out.println("The least number of moves for a pole of " + amountofdisks + " disks is " + goal1);
			System.out.println("Are you ready to playyy");
			inScan.nextLine();
			ready = inScan.nextLine();


			while ("y".equals(ready))
			{
				System.out.println(toh);
				System.out.println("Number of Moves " + moves);
				System.out.println("Enter <from><space><to> to move a disk:");
				usermove = inScan.nextLine();
				d = getMove(usermove);
				p = getPoleMove(usermove);

				if (d >= 1 && d <= 3 ) 
				{
					boolean result = true;
					if (p >= 1 && p <= 3)
					{

					result = toh.move(d,p);
				
					
				
					moves++;
					}
					else 
					{
						System.out.println("Invalid Option");
						moves++;
					}
				}
				else  
				{
					System.out.println("Invalid Option");
					moves++;
				}

			



				if (toh.getNumberOfDisks(3) == amountofdisks)
				{
					System.out.println("Congratulations you win!!");
					ready = "n";
					answer = 2;

				}

			} 



			}

			else 
			{
				answer = 1;
			}




		}

		while (answer == 1);
	}
public static int getMove(String themove)
{

		StringBuilder sb = new StringBuilder();
		char diskmove = themove.charAt(0);
		sb.append(diskmove);
		String str = sb.toString();
		int thediskmove = Integer.parseInt(str);


		return thediskmove;
}


public static int getPoleMove(String themove)
{

		StringBuilder sb = new StringBuilder();
		char polemove = themove.charAt(2);
		sb.append(polemove);
		String str = sb.toString();
		int thepolemove = Integer.parseInt(str);

		return thepolemove;
}

public static int getTotalOfDisks(int amountofdisks)
{
		int amountofdisks2 = amountofdisks*2;
	 	int total = 0;
		for (int i = amountofdisks2; i >= 0; i = i -2)
		{
			total += i;


		}
		System.out.println(total);

		return total;
}


}

