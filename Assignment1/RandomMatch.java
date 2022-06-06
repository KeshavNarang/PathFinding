import java.util.*;
public class RandomMatch 
{
	public static void main (String [] args)
	{
		Random rand = new Random ();
		int numberTrials = Integer.parseInt(args[0]);
		int counter = 0;
		
		for (int i = 0; i < numberTrials; i++) // Run the program the number of trials
		{
			for (int j = 3; j <= 6; j++) // Use an array of size 10^3 to 10^6
			{
				// Make two arrays and randomly fill them with a six digit integer.
				int [] array1 = new int [(int)Math.pow(10, j)];
				int [] array2 = new int [(int)Math.pow(10, j)];
				for (int k = 0; k < array1.length; k++)
				{
					array1[k] = rand.nextInt(899999) + 100000;
					array2[k] = rand.nextInt(899999) + 100000;
				}
				
				Arrays.sort(array1);
				Arrays.sort(array2);
				
				for (int k = 0; k < array1.length; k++)
				{
					if (binarySearch(array2, array1[k], 0, array2.length - 1))
					{
						counter++;
					}
				}
				
			}
		}
		System.out.println(counter/numberTrials);
	}
	
	public static boolean binarySearch (int [] array, int target, int low, int high)
	{
		int mid = (low + high) / 2;
		while (low <= high)
		{
			if (array[mid] > target)
			{
				high = mid - 1;
				binarySearch(array, target, low, high);
			}
			else if (array[mid] < target)
			{
				low = mid + 1;
				binarySearch(array, target, low, high);
			}
			else
			{
				return true;
			}
		}
		return false;
	}
}