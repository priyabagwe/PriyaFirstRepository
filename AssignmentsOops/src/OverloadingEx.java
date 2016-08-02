
public class OverloadingEx {
    static String concateString(String s1, String s2)
    {
        return s1+s2;
    }
 
    static String concateString(String s1, String s2, String s3)
    {
        return s1+s2+s3;
    }
 
    static String concateString(String s1, String s2, String s3, String s4)
    {
        return s1+s2+s3+s4;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(concateString("ONE", "TWO"));
		 
	        System.out.println(concateString("ONE", "TWO", "THREE"));
	 
	        System.out.println(concateString("ONE", "TWO", "THREE", "FOUR"));
	    }
	
	}


