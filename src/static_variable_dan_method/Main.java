package static_variable_dan_method;
import java.util.Scanner;

public class Main {
	
//	 static object 
	static Scanner scanner = new Scanner(System.in);
	
//	static variable
	static int index = 0;
	
//	static method
	public static void perulangan()
	{
		System.out.print("jumlah yang akan diulang : ");
		int jumlah = Integer.parseInt(scanner.nextLine());
		
		while(index > jumlah)
		{
			System.out.println("[" + (index+1) +"]. Halo");
			index++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perulangan();
	}

}
