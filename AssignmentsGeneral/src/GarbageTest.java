
public class GarbageTest {
	 public void finalize(){System.out.println("object is garbage collected");}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		GarbageTest s1 =  new GarbageTest(); 
		@SuppressWarnings("unused")
		GarbageTest s2 = new GarbageTest();  
		  s1=null;  
		  s2=null;  
		  System.gc();  
		 }  
		
	}

