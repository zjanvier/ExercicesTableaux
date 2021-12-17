import java.util.Arrays;
import java.util.Random;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description : Programme permettant de générer au hasard
              un tableau d'entiers et de les trier du plus
              grand au plus petit.
*/

public class Exercice1b
{

	public static void main(String[] args)   
	{  
		int[]monTab=new int[10];
		Random r=new Random();
		int tmp = 0;
		
		for (int i = 0; i < monTab.length; i++)   
		{  
			monTab[i]=r.nextInt(49)+1;
			for (int j =0; j < i; j++)   
			{  
				  
				if (monTab[i] > monTab[j])   
				{  
					tmp = monTab[i];  // mettre l'élement dans un endroit temporaire
					monTab[i] = monTab[j];  //deuxième devient premier
					monTab[j] = tmp;   // remettre la première valeur à sa place
				}  
			}  	 
		} 
		
		System.out.println(Arrays.toString(monTab));
	}  

}
