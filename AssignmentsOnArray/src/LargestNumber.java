
public class LargestNumber {
	
	public int getLargest(int[] numbers)
	{
		int maxValue = numbers[0];
		for (int i = 1; i<numbers.length; i++){
			if (maxValue < numbers[i]){
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int [] numbers  = new int [5];
		numbers [0] = 10;
		numbers [1] = 34;
		numbers [2] = 50;
		numbers [3] = 70;
		numbers [4] = 5;
		
		LargestNumber LN = new LargestNumber();
		
		System.out.println("Largest Number is" + " " + LN.getLargest(numbers));
			
	}

}
