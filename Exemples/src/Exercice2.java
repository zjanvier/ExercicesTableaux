import java.util.Arrays;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description :Programme permettant d'afficher l'élement le plus petit
             d'un tableau d'entiers générés au hasard


*/

public class Exercice2
{

	public static void main(String[] args)
	{
		int[]monTab=new int[10];
		for(int i=0;i<10;i++)
		{
			// générer au hasard entre 1 et 100
			monTab[i]=(int)(Math.random()*50+1);
			
		}
		int idx=0;
		int min=monTab[0];
		for(int i=0;i<10;i++)
		{
			if(monTab[i]<min)
			{
				min=monTab[i];
				idx=i;
			}
			
		}
		System.out.println(Arrays.toString(monTab));
		System.out.println(idx);

	}

}
