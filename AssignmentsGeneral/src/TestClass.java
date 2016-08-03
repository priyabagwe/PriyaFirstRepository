

// this is the example of the private and public  access modifier
class test{
	//private int data = 25;
	//private void message(){
	public int data = 25;
	public void message(){

		System.out.println("I am example of private access modifier");
	}
}


public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj = new test();
		System.out.println(obj.data);
		obj.message();

	}

}


