import java.util.Scanner;
public class RoxasBubble
{
    
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = s.nextInt();
        int storage[] = new int[size];
        
        for(int i =0;i<size;i++)
        {
            System.out.print("Enter value in array ["+i+"]: ");
            storage[i] = s.nextInt();
        }
 
        bubbleSort(storage,size);
    }
    
static void bubbleSort(int arr[], int n)
{
    int i, j, temp, flag=0;
    for(i = 0; i < n; i++)
    {
        for(j = 0; j < n-i-1; j++)
        {
            // introducing a flag to monitor swapping
            if( arr[j] > arr[j+1])
            {
                // swap the elements
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                // if swapping happens update flag to 1
                flag = 1;
            } 
        }
        // if value of flag is zero after all the iterations of inner loop
        // then break out
        if(flag==0)
        {
            break;
        }
    }
    
    // print the sorted array
    System.out.println("Sorted Array: ");
    for(i = 0; i < n; i++)
    {
        System.out.print(arr[i]+" ");
    }
}
    
    static void print (int a[]) //function to print array elements  
    {  
        int n = a.length;  
        int i;  
        for (i = 0; i < n; i++)  
        {  
            System.out.print(a[i] + " ");  
        }   
    }
    
}
