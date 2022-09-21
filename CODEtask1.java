import java.util.*;

public class Task1
{
	//FUNCTION THAT IMPLEMENTS THE NUMBER GUESSING GAME
	
	public static void guessnumber()
	{
		Scanner sc = new Scanner(System.in);
		
		//Generating a random number
		int number = 1+(int)(100* Math.random());
		
		//Number of trails given
		
		int k = 6;
		int i =0,guess;
		
		System.out.println("A NUMBER IS CHOOSEN BETWEEN 1-100 ,GUESS THE NUMBER WITHIN 6 TRAILS");
		
		while(i!=k)
		{
			System.out.println("GUESS THE NUMBER");
			//TAKING INPUT
			guess = sc.nextInt();
			
			//checking the number
			
			if(number == guess)
			{
				System.out.println("CONGRATULATIONS"+"YOU HAVE GUESSED THE NUMBER");
				break;
			}
			else if(number > guess && i!= k-1 )
			{
				System.out.println("THE NUMBER IS GREATER THAN "+guess);
			}
			else if(number <guess && i!=k-1)
			{
				System.out.println("THE NUMBER IS LESS THAN "+guess);
			}
			i++;
		}
		if(i==k)
		{
			System.out.println("YOU ARE OUT OF TRIES");
			System.out.println("THE NUMBER WAS "+number);
		}
	}
	
	public static void main(String[]args)
	{
	    //CALLING THE FUNCTION
		guessnumber();
	}
}
