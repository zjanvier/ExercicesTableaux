import java.util.Arrays;
import java.util.Random;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description :


*/

public class Hasard
{
	

	public static void main(String[] args)
	{
		int []myTab=new int[5];
		 //Random r=new Random();
		  
		for(int i=0;i<myTab.length;i++)
		{
			//myTab[i]=(int)(r.nextInt(100));
			myTab[i]=(int)(Math.random() * 20+1);
			
		}
		System.out.println(Arrays.toString(myTab));
		  
		 
		  
		
		
		
		

	}

}
