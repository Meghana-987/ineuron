import java.util.Scanner;

class Guesser
{
	int GuessNum;
	int n=10;
	public int guessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please guess the number:");
		GuessNum=sc.nextInt();
		if(GuessNum>n)
		{
			System.out.println(" please guess the number below"+n);
			guessNumber();
		}
		else
		{
			System.out.println("");
			
		}
		  return GuessNum;
		
			
	}
}

class Player
{
	int pguessNumber;
	int n=10;
	public int guessNumber()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" player please guess the number:");
		pguessNumber=sc.nextInt();
		if(pguessNumber>n)
		{
			System.out.println("please guess the number below"+n);
			guessNumber();
		}
		else
		{
			System.out.println("");
		}
		return pguessNumber;
	}
}
class Umpire
{
	int n=10;
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int numFromPlayer4;
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	public void collectNumFromPlayer()
	{
		Player p=new Player();
		
		numFromPlayer1=p.guessNumber();
		numFromPlayer2=p.guessNumber();
		numFromPlayer3=p.guessNumber();
		numFromPlayer4=p.guessNumber();
	}
	public void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 &&numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4)
			{
				System.out.println("game tied all four players gussed correctly");
				
			}
			else if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and Player 2 and Player3 won the game"); 
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player1 and Player 2 won the game"); 
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player1 and Player 3 won the game"); 
			}
			else if(numFromGuesser==numFromPlayer4)
			{
				System.out.println("Player1 and Player 4 won the game"); 
			}
			else
			{
				System.out.println("Player1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3 && numFromGuesser==numFromPlayer4 )
			{
			System.out.println("Player2 and Player3 and Player4 won the game");
		    }
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player2 and Player 3 won the game"); 
			}
			else if(numFromGuesser==numFromPlayer4)
			{
				System.out.println("Player2 and Player 4 won the game"); 
			}
			else
			{
				System.out.println("Player2  won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			 if(numFromGuesser==numFromPlayer4)
			{
				System.out.println("Player3 and Player 4 won the game"); 
			}
			 else
			 {
				 System.out.println("Player3  won the game"); 
			 }
		}
		else if(numFromGuesser==numFromPlayer4)
		{
			System.out.println(" Player 4 won the game"); 
		}
		else
		{
			System.out.println("game lost! try again....");
		}
	}
	
}
public class lunchGame {

	public static void main(String[] args)
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		
		u.collectNumFromPlayer();
		u.compare();
	}

}
