import java.util.*;

public class Task1
{
    //FUNCTION THAT IMPLEMENTS THE NUMBER GUESSING GAME

    public static void guessnumber()
    {
        Scanner sc = new Scanner(System.in);

        //Generating a random number
        int number = 1+(int)(100* Math.random());

        int points =100;
        //Number of trails given

        int k = 4;
        int i =0,guess;
        int j =0;
        int flag =0;
        System.out.println("A NUMBER IS CHOOSEN BETWEEN 1-100 "+"GUESS THE NUMBER WITHIN 4 TRAILS YOU HAVE 3 ROUNDS");
        while(j!=3)
        {
            while(i!=k)
            {
                System.out.println("GUESS THE NUMBER");
                System.out.println("YOU HAVE "+(3-j)+" rounds left");
                //TAKING INPUT
                guess = sc.nextInt();


                //checking the number

                if(number == guess)
                {
                    System.out.println("CONGRATULATIONS "+"YOU HAVE GUESSED THE NUMBER");
                    System.out.println("YOUR POINTS ARE "+points);
                    flag =1;
                    break;
                }
                else if(number > guess && i!= k-1 )
                {
                    points -=5;
                    System.out.println("THE NUMBER IS GREATER THAN "+guess);
                }
                else if(number <guess && i!=k-1)
                {
                    points -=5;
                    System.out.println("THE NUMBER IS LESS THAN "+guess);
                }
                i++;
            }

            if(flag==1)

                break;
            if(i==k)
            {
                points -=10;
                if(j!=3)
                {
                    i=0;
                    j++;
                    continue;
                }
            }
        }

        if(j==3)
        {
            System.out.println("YOU ARE OUT OF TRIES AND NO ROUNDS LEFT");
            System.out.println("THE NUMBER WAS "+number +" YOUR POINTS ARE 0.");
        }


    }

    public static void main(String[]args)
    {
        //CALLING THE FUNCTION
        guessnumber();
    }
}
