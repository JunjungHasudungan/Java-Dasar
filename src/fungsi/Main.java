package fungsi;
import java.util.Scanner;


public class Main {
	
//	function void dengan parameter
	static void perkenalan(String nama)
	{
		System.out.print("Halo, nama saya " + nama);
	}
	
	static void gambar(int panjang, int lebar)
	{
		for(int i = 0; i < panjang; i++)
		{
			for(int j = panjang; j < lebar; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String nama;
		int panjang, lebar;
		
//		System.out.print("nama : ");
//		nama = scanner.nextLine();
		

		System.out.print("jumlah panjang : ");
		panjang = scanner.nextInt();
		
		System.out.print("jumlah lebar : ");
		lebar = scanner.nextInt();
		
		
//		perkenalan("Hasudungan");
		
		gambar(panjang, lebar);

	}

}
