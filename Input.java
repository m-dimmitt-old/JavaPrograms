import java.util.Random;
import java.util.Scanner;

class Input{
	Scanner sc = new Scanner(System.in);
	int size;
	int[] Arr;		
	void promptUser()
	{
		System.out.printf("\nHello User, enter the size you would like to make the array\n");
		size = sc.nextInt();
		//putValidation here.
		Arr = new int[size];	
	}	
	void buildArray()
	{
		Random rng = new Random();
		for(int i = 0; i < size; i++)
		{
			Arr[i] = rng.nextInt();	
		}
	}
	void printArray()
	{
		for(int i = 0; i < size; i++)
        {
            System.out.printf("%d\n",Arr[i]);
        }
	}		
}
