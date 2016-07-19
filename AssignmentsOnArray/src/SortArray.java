
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {12,16,45,10,30,15};
		for(int no:arr){
			System.out.println(no);
		}
		//descending order
		int temp;
		
		
		for(int i = 0; i<=arr.length-1; i++){
			for (int j =0; j<=arr.length-2; j++)
			{
				if(arr[j]<arr[j+1]){
					temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		   System.out.println("  ..........   ");
		   for (int no:arr){
	            System.out.println(" after sorting  "+no);
		   }
	}
	}

		
		
		
		
		
		
		
		
	