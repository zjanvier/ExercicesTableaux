import java.util.Arrays;

public class Copie2 {

	public static void main(String[] args) 
	{
		int []list1= {1,2,3,4,5};
		
		int []list2=new int[5];
		
		for(int i=0;i<5;i++)
		{
			list2[i]=list1[i];
		}
		
		list1[0]=67;
		list2[0]=1;
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
	}

}
