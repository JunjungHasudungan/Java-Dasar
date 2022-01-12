package array_1_dimensi;
import java.util.Scanner;

public class Main {

	static void matriks1Dimensi()
	{
		int jumlah;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("jumlah nilai arr : ");
		jumlah = scanner.nextInt();
		
		int arr[] = new int[jumlah];
		
		for(int i = 0; i < jumlah; i++)
		{
			System.out.print("["+ (i+1) + "] = ");
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("\tnilai dalam arr : ");
		for(int j = 0; j < jumlah; j++)
		{
			System.out.println(arr[j]);
		}
	}
	
	public static void main(String[] args) {

		matriks1Dimensi();
	}

}
