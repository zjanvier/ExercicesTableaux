import java.util.Scanner;

public class Enseignant {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("nombre d'éleves");
		int nb=sc.nextInt();
		int [] notes=new int[nb];
		String [] noms=new String[nb];
		int []mention = new int[4];
		for(int i=0;i<nb;i++)
		{
			System.out.println("nom de l'élève " + (i+1)+ " sa note");
			noms[i]=sc.next();
			notes[i]=sc.nextInt();
			if(notes[i]>=90)
				mention[0]++; // excellent
			else if(notes[i]>=80)
				mention[1]++; // Très bien
			else if(notes[i]>=70)
				mention[2]++; // Assezbien
			else 
				mention[3]++; // Mediocre
		}
		
		
		//affichage
		if(mention[0]>0)
		{
			System.out.println("Excellent (" + mention[0]+ ")");
			for(int i=0;i<nb;i++)
			{
				if(notes[i]>90)
				{
					System.out.print(noms[i]);
					System.out.print(" ");
					System.out.println(notes[i]);

				}

			}

		}

		sc.close();
	}

}
