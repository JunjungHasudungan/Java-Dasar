package matriks2Dimensi;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	static int input()
	{
		System.out.print("masukkan nilai baris : ");
		int baris = scanner.nextInt();
		
		System.out.print("masukkan nilai kolom : ");
		int kolom = scanner.nextInt();
		
		return  baris;
		
	}
	
	static void matriks2Dimensi()
	{
		int baris, kolom;
		
		System.out.print("jumlah baris : ");
		baris = scanner.nextInt();	
	
		System.out.print("Jumlah kolom : ");
		kolom = scanner.nextInt();
		
		System.out.println(" ");
		int arr2[][] = new int[baris][kolom];
		
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				System.out.print("Baris ke[" + (i+1) + "] kolom ke [" + (j+1) + "] : ");
				arr2[i][j] = scanner.nextInt();
			}
			System.out.println(" ");
		}
		
		System.out.println("Nilai dalam matriks 2 dimensi : ");
		for(int k = 0; k < baris; k++)
		{
			for(int l = 0; l < kolom; l++)
			{
				System.out.print(arr2[k][l] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		
		matriks2Dimensi();

		
//		int arr[][]= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//		
//		for(int i = 0; i < 3; i++)
//		{
//			for(int j = 0; j < 3; j++)
//			{
//				System.out.print(arr[i][j] + "\t ");
//			}
//			System.out.println(" ");
//		}

	}
}
