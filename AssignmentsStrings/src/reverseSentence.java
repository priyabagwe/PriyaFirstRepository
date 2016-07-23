
public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is great";
		System.out.println(s);
		System.out.println(" ");
		for (int i=s.length()-1; i>=0; i--){
			System.out.print(s.charAt(i));
		}
	}

}
