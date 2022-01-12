package perulangan;
import java.util.Scanner;

public class Main2 
{

	public static void main(String[] args) 
	{
		int jumlah;
		int i = 0;
		// perulangan menggunakan while 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan jumlah yang akan diulang : ");
		jumlah = Integer.parseInt(scanner.nextLine());	
		
		while( i > jumlah)
		{
			System.out.println("[" +(i+1)+"].Halo");
			i++;
		}
	}

}
