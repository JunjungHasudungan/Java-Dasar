package array;
import java.util.Scanner;
public class Main {

//	mencari nilai matriks dalam 1 dimensi
	public static void main(String[] args) {
//		data member
		int jumlah, nilaiYangDicari, nilaiYangDiTemukan;
		boolean pencarian = false;
		
		//		inisilasisasi object
		Scanner scanner = new Scanner(System.in);
		
//		menangkap jumlah arr dari inputan user 
		System.out.print("Masukkan jumlah arr : ");
		jumlah = scanner.nextInt();
		
//		membuat variable baru beripe array sebagai tempat menampung masukkan variable jumlah 
//		kedalam arr yang akan dilooping 
		int jumlahArr[]  = new int[jumlah];
		
//		menampilkan jumlah inputan user dan menangkap nilai inputan yang akan dimasukkan dalam arr
		for(int i = 0; i < jumlah; i++)
		{
			System.out.print("Nilai ke [" + (i+1) +"] = ");
			jumlahArr[i] = scanner.nextInt();
		}
		
//		menampilkan nilai hasil yang sudah ditangkap melalui user input yang sudah dimasukkan dalam arr
		System.out.println("Nilai dalam arr : ");
		for(int j = 0; j < jumlah; j++)
		{
			System.out.println("index ke [" +(j+1) +"] = " + jumlahArr[j]);
		}
		
//		menangkap inputan user pada nilai yang akan dicari
		System.out.print("Masukkan nilai yang dicari dalam arr : ");
		nilaiYangDicari = scanner.nextInt();
		
//		melakukan perbandingan list entry yang sudah dimasukkan dan memasukkan kedalam variable yang berisi nilai 0
		for(int k = 0; k < jumlah; k++)
		{
//			jika nilai arr dari jumlah arr yang sudah dimasukkan == nilai yang dicari  
			if(jumlahArr[k] == nilaiYangDicari)
			{
//				pencarian benar
				pencarian = true;
//				
				nilaiYangDiTemukan = k + 1;
				System.out.println("Nilai" + "["+ nilaiYangDicari+"]" + "Ditemukan, berada pada index ke " + "[" + nilaiYangDiTemukan + "]");
			}
		}
		if(pencarian == false)
		{
			System.out.println("Nilai" + "["+ nilaiYangDicari+"]" + "Tidak Ditemukan ! ");	
		}	
	}
	
}