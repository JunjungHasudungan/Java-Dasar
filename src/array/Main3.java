package array;
import java.util.Scanner;

public class Main3 
{	
	//	membuat matriks 2 dimensi
	
	public static void main(String[] args) {
		
		int baris, kolom;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("jumlah baris : ");
		baris = scanner.nextInt();
		
		System.out.print("jumlah kolom : ");
		kolom = scanner.nextInt();
		
		int arr[][] = new int[baris][kolom];
		
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				System.out.print("baris[" + (i+1) + "] kolom[" + (j+1) + "] : ");
				arr[i][j] = scanner.nextInt();
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 0; i < baris; i++)
		{
			for(int j = 0; j < kolom; j++)
			{
				System.out.print("\t" + arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
