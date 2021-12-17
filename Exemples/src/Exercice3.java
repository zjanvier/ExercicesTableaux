import java.util.Scanner;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description : Programme permettant d'afficher les noms des joueurs
              en ordre décroissant des buts marqués


*/

public class Exercice3
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre de joueurs");
		int nb=sc.nextInt();
		int buts[]=new int[nb];
		String noms[]=new String[nb];
		
		for(int i=0;i<nb;i++)
		{
			System.out.println("nom du joueur "+ (i+1));
			noms[i]=sc.next();
			System.out.println("Nombre de buts marqués par le joueur "+ noms[i]);
			buts[i]=sc.nextInt();			
		}
		
		//organiser selon le nombre de buts marqués
		
		for (int i = 0; i < nb; i++)   
		{  
			for (int j = i + 1; j < nb; j++)   
			{  
				int tmp = 0; 
				String p="";
				if (buts[i] < buts[j])   
				{  
					tmp = buts[i];  // mettre l'élement dans un endroit temporaire
					p=noms[i];
					buts[i] = buts[j];  //deuxième devient premier
					noms[i]=noms[j];
					buts[j] = tmp;   // remettre la première valeur à sa place
					noms[j]=p;
				}  
			}  	 
		} 
		
		//imprimer selon les buts
		for (int i = 0; i < nb; i++) 
		{
			System.out.print(noms[i] + " ");
			System.out.println(buts[i]);
		}
		
	sc.close();	

	}

}
