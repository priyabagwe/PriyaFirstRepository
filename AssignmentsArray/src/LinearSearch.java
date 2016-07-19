
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {12, 45, 60, 75, 56};
		int search = 60;
		for (int i =0; i< arr.length; i++){
			if (arr [i] == search){
				System.out.println("The element which we are looking for is"+ " "+ search + " " + "which is at index" +" "+ i);
			}
		}

	}

}
