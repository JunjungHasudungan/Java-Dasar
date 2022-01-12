package perulangan;
import java.util.Scanner;

public class Main 
{
//	perulangan menggunakan for
	static Scanner scanner = new Scanner(System.in);
	static String kata;
	static void looping()
	{
		int jumlah;
		
		System.out.print("jumlah nilai : ");
		jumlah = scanner.nextInt();
		
		System.out.print("kata yang ini dilooping : ");
		kata = scanner.nextLine();
		
		for(int i = 0; i < jumlah; i++)
		{
			System.out.println("[" + (i + 1) + "]" + kata);
		}
		
	}
	
	public static void main(String[] args) 
	{
		looping();
		
//		String perkenalan = "Halo";
//		
////		akan mengulang sebanyak 4 x kata "halo"
//		for(int i = 0; i < 4;  i++)
//		{
//			System.out.println("[" + (i+1)+"]." + perkenalan);
//		}
	}
}
