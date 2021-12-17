import java.util.Arrays;

public class Deplacement {

	public static void main(String[] args) 
	{

		double [ ]myList= {1,2,3,4,5,6,7,8,9,10};
		double temp = myList[0]; // Garder les infos du premier élément
		// Shift elements high
		for (int i = 1; i < myList.length; i++) 
		{
			myList[i - 1] = myList[i];
		}
		// le premier élement va prendre la dernière place
		myList[myList.length - 1] = temp;
		System.out.println(Arrays.toString(myList));

	}

}
