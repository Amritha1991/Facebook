package LoginPage;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println("2");
		try {
			System.out.println(10/0); }
			
			catch (Throwable e) {
				System.out.println("Boss exception is handled");
			}
		
			System.out.println("5");
			
			String s = "Velu";
					
			try {
				s.charAt(7);
				System.out.println(s);
			}
			
			catch(Throwable e) {
				
			}
			System.out.println("Sakthivel");
		
	}
}

				
			
