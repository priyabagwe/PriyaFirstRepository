

//Immutable Example
public final class Contacts {

		// TODO Auto-generated method stub
		  private final String name;
		    private final String mobile;

		    public Contacts(String name, String mobile) {
		        this.name = name;
		        this.mobile = mobile;
		    }
		  
		    public String getName(){
		        return name;
		    }
		  
		    public String getMobile(){
		        return mobile;
		    }
		


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Contacts contact = new Contacts("Raj","2532185643");
				System.out.println(contact.getName());
				System.out.println(contact.getMobile());

				
			}

		}

	


