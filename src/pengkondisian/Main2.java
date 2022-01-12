package pengkondisian;
import java.util.Scanner;

public class Main2 {
//pengkondisian menggunakan switch case dan dengan input user
	
	public static void main(String[] args) {
		int pilihan;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== MENU UTAMA ===");
		System.out.println("1. INSERT DATA");
		System.out.println("2. SHOW DATA");
		System.out.println("3. EDIT DATA");
		System.out.println("4. DELETE DATA");
		System.out.println("0. KELUAR");
		System.out.println("");
		System.out.print("pilihan : ");
		pilihan = Integer.parseInt(scanner.nextLine());
		
		switch(pilihan) 
		{
			case 0: 
				System.exit(0);
				break;
			case 1:
				System.out.println("INSERT DATA");
				break;
			case 2:
				System.out.println("SHOW DATA");
				break;
			case 3:
				System.out.println("EDIT DATA");
				break;
			case 4:
				System.out.println("DELETE DATA");
				break;
			default:
				System.out.println("Pilihan tidak ada !");
		}
	}

}
