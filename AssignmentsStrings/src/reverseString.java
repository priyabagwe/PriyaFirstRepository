 
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Aayush";
		int i;
		for (i=0; i<=s.length()-1; i++){
			System.out.print(s.charAt(i));
			}
		System.out.println();
		for (i=s.length()-1; i>=0;i--){
			System.out.print(s.charAt(i));
		}

	}

}
