package LoginPage;

public class Java extends JavaScript {

	 public void Str() {
		String a = "Wecome to the world";
		for (int i=a.length()-1; i >=0; i--) {
		char pri = a.charAt(i);
		System.out.println(pri);
		}
	}


	public void rbi()
	{
		System.out.println("Rbi = vannarepet");
	}
	public void Star() {
		String S = "*";
		for (int i=5; i>=1; i--) {
			for(int i1 = 1; i1<=i; i1++) {
				System.out.print(S);
			}
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		Java obj = new Java();
		obj.Str();
		obj.rbi();
		//obj.Java();
		obj.Star();
	}
		
	}
	
	

