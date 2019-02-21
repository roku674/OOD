package hw1;
import java.util.Random;

public class dataSHwQ4	{
	
	public static void uniqueIntFinder(int[] array1,	int[] array2)
	{
		int count	=	0;
		boolean uniqueInts = true;
		for(int i=0; i<array2.length; i++)
		{
			uniqueInts	=	true;	
			for(int j=0; j<array1.length; j++) {
				if(array2[i] == array1[j])	
				{
					uniqueInts = false;
					break;
				}
			}
			for(int p=0; p<array2.length; p++) {
				if(p!= i && array2[i] == array2[p])	
				{
					uniqueInts = false;
					break;
				}
			}
			if(uniqueInts)
			{
				count++;
				System.out.println(array2[i]);
			}
		}
		System.out.print(" unique ints " +	count);
	}
	public static void main(String[] args) {
		
		int size = 10;
		int []matrix1 = new int [size];
		int []matrix2 = new int [size];
		int randomInt = 0;
		Random rng = new Random();	
		
		for (int i=0;i<size;i++){
			randomInt = rng.nextInt(size)+1;
			matrix1[i] = randomInt;	
			randomInt = rng.nextInt(size)+1;
			matrix2[i] = randomInt;	
		}
		System.out.println("the matrix contains ");
		for (int i=0; i<size; i++){
			System.out.print(" " + matrix1[i]);
		}
		System.out.println("");
		for (int i=0;i<size;i++){
			System.out.print(" " + matrix2[i]);
		}
		System.out.println("");
		long start	= System.nanoTime();	
		for(int k=0; k<100;	k++){	
			uniqueIntFinder(matrix1, matrix2);
		}
		long end = System.nanoTime();	
		System.out.println("Runetime " + (end-start)/100+ "ms.");
	}
}