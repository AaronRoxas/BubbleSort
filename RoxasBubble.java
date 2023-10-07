import java.util.Scanner;
public class bubbleSort
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = s.nextInt();
        int array[] = new int [size];
        
        System.out.println("Enter values to put in array:");
        for(int i = 0; i < size;i++)
        {
            array[i] = s.nextInt();
        }
        sort(array);
        System.out.print("Enter value to find: ");
        int val = s.nextInt();
        search(array,val);

    }
    //Method to do Binary Search
    static void search(int array[], int target) 
    {
        int size = array.length;
        int lowBound = 0;  
        int highBound = size - 1; 
        String display ="Value not found";

        while (lowBound <= highBound) 
        {
            int mid = lowBound + (highBound - lowBound) / 2;

            if (array[mid] < target)
            {
                lowBound = mid + 1;
            } 
            else if (array[mid] > target)
            {
                highBound = mid - 1;
            } 
            else
            {
                display = target + " found at index " + mid;
                break;
            }
        }
        System.out.println(display);
    }
    
    static void sort(int array[])
    {
        int size = array.length;
        int temp;
        String display = "";
        String unsorted = "";
        //loop to display unsorted array
        for(int i = 0; i<size;i++)
        {
            unsorted += array[i]+" ";
        }
        //Loop to sort array
        for(int i = 0; i <size-1;i++)
        {
            for(int j = 0; j<size-1;j++)
            {
                if(array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;          
                }
            }
        }
        //Loop to display sorted array
        for(int i = 0; i<size;i++)
        {
            display += array[i]+" ";
        }
        System.out.println("Unsorted Array: " + unsorted
                +"\nSorted Array: " + display);
    }
}
