
public class MissNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	          
	        int[] arr = {10,9,3,6,4,5,7,1,2};  
	        int indexesN = 10;  
	        int values = 0;  
	          
	        for (int i = 0; i < arr.length; i++) {  
	            indexesN += i+1;  
	            values += arr[i];  
	        }  
	          
	        int result = indexesN - values;  
	          
	        System.out.println("Missing number is: "+result);  
	    }  
		
	}
	

	

		
		
		
		
		
		
		
		/*int sum = 0;
		int idx = -1;
		
		int [] arr = new int [5];
		int arr [] = {10,11,12,13};
		
		for (int i = 0; i < arr.length; i++)
		{
		    if (arr[i] == 0)
		    {
		         idx = i; 
		    }
		    else 
		    {
		         sum += arr[i];
		    }
		}

		// the total sum of numbers between 1 and arr.length.
		int total = (arr.length + 1) * arr.length / 2;

		System.out.println("missing number is: " + (total - sum) + " at index " + idx);
	}

}*/
