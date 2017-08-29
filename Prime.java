import java.util.*;

public class Prime {

	public static void main(String[]args){

		Scanner in=new Scanner(System.in);

		System.out.print("Enter a Num: ");

		int input=in.nextInt();

		int mid=input/2;
		
int flag=0;

		
		/* for 2 to Mid of input Check the Mod operation of User input*/
		
		for(int i=2;i<mid;i++)
		{

			if(input%i==0)
			{

				flag=1;

				break;

			}

		}
		
	if(flag==1)

		System.out.println("The Num You Entered Is Not a Prime Number !!");

	else
 
		System.out.println("The Num You Entered Is a Prime Number !!");
	
	}

}
