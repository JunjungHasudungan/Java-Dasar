package perulangan;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// Melakukan perulangan menggunakan do while
		int jumlah;
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("jumlah yang akan diulang : ");
		jumlah = Integer.parseInt(scanner.nextLine());
		
//		yang dilakukan  pertama adalah di eksekusi meskipun kondisi salah
		do {
			System.out.println("[" +(i+1) +"]. Halo");
			i++;
		}while(i < jumlah);

	}

}
