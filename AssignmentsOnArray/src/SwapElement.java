
public class SwapElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,5,6,4};
		for(int no:array){
			System.out.println(no);
		}
		
		int i,j, temp;
		for(i=0;i<array.length-1;i++){
			for (j=i+1; j<array.length;j++){
				if (array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}	
		}
		System.out.println("  ..........   ");
		   for (int no:array){
	            System.out.println(" after swapping  "+no);
		  
}
	}
}

	
		
		
		
		
	