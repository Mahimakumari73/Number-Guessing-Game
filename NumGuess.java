import java.util.*;
class Number
{
	public void num()
	{		
		int Chance=5;
        System.out.println("Number Guessing Oppurtunity in 5 trails");
        Scanner sc=new Scanner(System.in);
	    int val = 1 + (int)(100 * Math.random());
		int m=100,opp=1;
		for(opp=1;opp<=Chance;opp++)
		{
			
			System.out.println("Enter the number by Guessing .Chance "+(opp));
			int n=sc.nextInt();
			if(n==val)
			{
				System.out.println("Fab!Good job");
				System.out.println("Final score "+m);
				break;
			}
			else if(n>val)
			{
				System.out.println("Number is smaller than "+n);
				
				m-=20;
			}
			else
			{
				System.out.println("Number is greater than"+n);
				m-=20;
			}
			
		} 
		if(opp>Chance)
		{
		    System.out.println("Next time");
			System.out.println("The number is "+val);
			System.out.println("Your score is: 0");
		}
	}
}
class NumGuess
{
    public static void main(String args[])
    {
    	
    	Scanner sc=new Scanner(System.in);
    	Number g =new Number();
    	System.out.println("Shall we start it ? : Yes/No");
    	String str=sc.nextLine();
    	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
    	{
    		g.num();
    		System.out.println("Wants to play again ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game ended!!! Nice Try..");
    }
}