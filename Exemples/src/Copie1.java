import java.util.Arrays;

public class Copie1 {

	public static void main(String[] args) 
	{
		int []list1= {1,2,3,4,5};
		
		int []list2= list1;
		
		list2[0]=8;
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	}

}
