package array;
import java.util.Scanner;

// mencari nilai dalam matriks 2 dimensi
public class Main2 {

	public static void main(String[] args) {
		int baris, kolom, nilaiYangDicari;
		
		boolean pencarian = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("jumlah baris : ");
		baris = scanner.nextInt();
		
		System.out.print("jumlah kolom : ");
		kolom = scanner.nextInt();
		
		System.out.println();
		
		int arr[][] = new int[baris][kolom];
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				System.out.print("baris[" + (i+1) + "] kolom[" +(j+1) +"] :");
				arr[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}
		
		System.out.print("nilai yang dicari : ");
		nilaiYangDicari = scanner.nextInt();
		
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				if(nilaiYangDicari == arr[i][j])
				{
					pencarian = true;
					System.out.print("[" + nilaiYangDicari + "]terletak pada " + "baris[" + (i+1) + "] kolom[" + (j+1) + "]");
				}
			}
		}
		if(pencarian == false)
		{
			System.out.print("[" + nilaiYangDicari + "] tidak ditemukan.");
		}
	}

}
