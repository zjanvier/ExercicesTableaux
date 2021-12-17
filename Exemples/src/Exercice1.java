import java.util.Arrays;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description : Programme permettant de générer au hasard
              un tableau d'entiers et de les trier du plus
              grand au plus petit.
*/

public class Exercice1
{

	public static void main(String[] args)   
	{  
		int[]monTab=new int[10];
		for(int i=0;i<10;i++)
		{
			// générer au hasard entre 1 et 50
			monTab[i]=(int)(Math.random()*50+1);
			
		}
		System.out.printf("%-18s","Tableau non trié :");
		System.out.println(Arrays.toString(monTab)); //Tableau non trié
		for (int i = 0; i < monTab.length; i++)   
		{  
			for (int j = i + 1; j < monTab.length; j++)   
			{  
				int tmp = 0;  
				if (monTab[i] > monTab[j])   
				{  
					tmp = monTab[i];  // mettre l'élement dans un endroit temporaire
					monTab[i] = monTab[j];  //deuxième devient premier
					monTab[j] = tmp;   // remettre la première valeur à sa place
				}  
			}  	 
		} 
		System.out.printf("%-18s","Tableau trié :");
		System.out.println(Arrays.toString(monTab));
	}  

}
