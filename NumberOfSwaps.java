/*
 * Sorts an array of given integers and returns the number of swaps
 * it took to sort the array, and the value of the first and last elements
 * in the array.
 */
import java.util.*;

public class NumberOfSwaps 
{
    
    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int numberOfSwaps = 0;

        
        for(int index = 0; index < n; index ++)
        {
            a[index] = input.nextInt();
        }
        
        for(int i = 0; i < n; i++) 
        {
    
            for (int j = 0; j < n - 1; j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    swap(a, j);
                    numberOfSwaps++;
                }
            }
    
            if (numberOfSwaps == 0) 
            {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }

	private static void swap(int[] a, int j) 
	{
		int temp;
		temp =a[j];
	    a[j]=a[j+1];
	    a[j+1]=temp;
		
	}
    
}