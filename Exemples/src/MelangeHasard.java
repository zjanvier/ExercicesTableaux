import java.util.Arrays;
import java.util.Random;

public class MelangeHasard {

	public static void main(String[] args)
	{
		Random ran= new Random();
		
		int []tab= new int[10];
		int temp=0;
		
		for (int i=0; i<tab.length; i++)
		{
			tab[i]= ran.nextInt(50)+1;
			for (int j=0; j<i; j++)
			{
				if (tab[j]>tab[i])
				{
					temp=tab[j];
					tab[j]=tab[i];
					tab[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(tab));
		
	}
	
}