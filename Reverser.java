import java.util.Scanner;

public class Reverser
{
   public static void main(String args[])
   {
       int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       j = i - 1;     
       i = 0;         
	   
       while(i<j)
       {
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
	   
       System.out.print("Now the Reverse of Array is : ");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i]+ "  ");
       }       
   }
}
