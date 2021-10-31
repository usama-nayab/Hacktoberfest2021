// code for linear and binary search

public class Search
{

static int not_found = -1;

// linear search method starts

public static int linearSearch(int [] arr , int target)
{
    for(int i=0 ; i<arr.length ; i++)
    {
        if(arr[i] == target)
        return i;
    }
    return not_found;
} 

// linear search method ends

// binary search method starts

public static int binarySearch(int [] arr , int target)
{
    int left = 0;
    int right = arr.length - 1;
    
    while(left <= right)
    {
        int mid = (left + right) / 2;
        if(target == arr[mid])
        return mid;
        
        else if(target < arr[mid])
        right = mid - 1 ;
        
        else if(target > arr[mid])
        left = mid + 1;
    }
    return not_found;
}

// binary search method ends

// main method 

	public static void main(String[] args) {
	
	       int target = 120;
          int [] arr = new int[150];
          for(int i = 0 ; i<arr.length ; i++)
          {
              arr[i] = i + 1;  //initialization
          }
          
System.out.println("By Linear search");
          
          System.out.println("at " + target + " the index will be: " + linearSearch(arr , target)); 

System.out.println("By Binary search");

System.out.println("at " + target + " the index will be: " + binarySearch(arr , target));
    
} // main method ends
}