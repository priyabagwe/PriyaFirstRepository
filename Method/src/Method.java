
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank user1 = new Bank();
		user1.setDetails("Sam", 25, "saving", 20000);
		user1.getDetails();

	}

}

class Bank{
	
	String name, accountType;
	int age, bal;
	
	int setDetails (String name, int age, String accountType, int bal){
		this.name = name;
		this.accountType = accountType;
		this.age = age;
		this.bal = bal;
		return 1;}
	void getDetails (){
		System.out.println("Name:"+name);
		System.out.println("AccountType:"+accountType);
		System.out.println("Age:"+age);
		System.out.println("Balance:"+bal);
		
	}
				
}
