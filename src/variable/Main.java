package variable;

public class Main {
//	deklarasi variable global 
	static int x  = 4;
	
	public static void main(String[] args) {
		/*
		 * deklarasi variable local 
		 * variable local adalah variable yang berada 
		 * dalam block code function / method
		 */
		int x = 5;

		System.out.println("Nilai variable global : " + Main.x);
		System.out.println("Nilai variable local : " + x);

		

	}

}
