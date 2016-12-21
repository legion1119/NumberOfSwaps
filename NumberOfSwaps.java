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
        int n = 0;
        int numberOfSwaps = 0;
        //collect data from user
        System.out.print("Enter the amount of integers to be sorted: ");
        n = input.nextInt();
        int[] a = new int[n];
        
        System.out.println("Now enter the integers to be sorted seperated by a /n"
        		+ "space or a new line: ");
        for(int index = 0; index < n; index ++)
        {
            a[index] = input.nextInt();
        }
        //swap integers and count number of swaps
        for(int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n - 1; j++) 
            {
                if (a[j] > a[j + 1]) 
                {
                    swap(a, j);
                    numberOfSwaps++;//counts swaps made
                }
            }
            if (numberOfSwaps == 0) //outputs if there are no swaps to be made
            {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n-1]);
    }
    //where the actual swapping of the integers takes place 
	private static void swap(int[] a, int j) 
	{
		int temp;
		temp =a[j];
	    a[j]=a[j+1];
	    a[j+1]=temp;
		
	}
    
}