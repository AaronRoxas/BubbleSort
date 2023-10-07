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
