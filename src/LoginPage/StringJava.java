package LoginPage;

public class StringJava {
	
	String S1 = "Sakthi";
	String S2 = new String("Sakthi");
	
	public void literalString() {
		

		int hashCode = System.identityHashCode(S1);
		System.out.println(hashCode);
		
		int code = System.identityHashCode(S2);
		System.out.println(code);
		if (hashCode==code) {
			System.out.println("The given String is Literal");
		}
			else {
				System.out.println("It is not");
					
		}

		
		String S3 = S1.concat(S2);
		System.out.println(S3);
	

StringBuffer a = new StringBuffer("Velu");
a.append(S3);
System.out.println(a);

StringBuilder h = new StringBuilder();
h.replace(0, 5, "Rock");
System.out.println(h);
      
	}
  

	public static void main(String[] args) {

		StringJava r = new StringJava();
		 r.literalString();
		

	}

}
