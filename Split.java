import java.util.*;

public class Split{

	public static void main(String[]args){

		Scanner in=new Scanner(System.in);

		String InputString="2.6, 5, 3.44, 6.88, 9";

	        String [] arrOfStr = InputString.split(",");

		double[]temp=new double[100];
		/* count measure the length of temp array after spliting*/

		int count=0;

		for(String S:arrOfStr)
			{

			temp[i]=Double.parseDouble(a);
			
count++;

			}

		System.out.println("[ ");
	
		for(int j=0;j<count;j++)
			{

			System.out.println("  "+temp[j]);
			
}
		System.out.print(" ]");	

	}

}
