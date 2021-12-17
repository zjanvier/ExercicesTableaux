import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Author:jzagabe
Date:Dec. 10, 2021
Description : Programme permettant de retrouver le nombre
             d'occurences d'un caractère donné par l'usager


*/

public class Exercice4
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char myChar[]=new char[10];
		Random random=new Random();
		int cpt=0; // compteur pour les chars
		for(int i=0;i<10;i++)
		{
			myChar[i]=(char)(random.nextInt(26)+'a');
			
		}
		//System.out.println(myChar);
		//vérifier le nombre d'occurences d'un caractère donné
		System.out.println("Ecrire un caractère donné");
		char e=sc.next().charAt(0);
		for(int i=0;i<10;i++)
		{
			if(myChar[i]==e)
				cpt++;
		}
		
		System.out.print("Il y a "+cpt + " "+ e + " dans le tableau ");
		System.out.println(myChar);

		sc.close();
	}

}
