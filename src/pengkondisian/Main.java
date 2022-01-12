package pengkondisian;
import java.util.Scanner;

//pengkondisian menggunakan if.. else if.. else menggunakan clas scanner

public class Main {

	public static void checkNilai(int input_nilai)
	{
		if(input_nilai < 50)
		{
			System.out.println("Grade E");
		}
		else if(input_nilai >= 50 && input_nilai <= 59)
		{
			System.out.println("GRADE D");
		}
		else if(input_nilai >= 60 && input_nilai <= 63)
		{
			System.out.println("GRADE C");
		}
		else if(input_nilai >= 64 && input_nilai <= 66)
		{
			System.out.println("GRADE C+");
		}
		else if(input_nilai >= 67 && input_nilai <= 69)
		{
			System.out.println("GRADE B-");
		}
		else if(input_nilai >= 67 && input_nilai <= 69)
		{
			System.out.println("GRADE B-");
		}
		else if(input_nilai >= 70 && input_nilai <= 74)
		{
			System.out.println("GRADE B");
		}
		else if(input_nilai >= 75 && input_nilai <= 79)
		{
			System.out.println("GRADE B+");
		}
		else if(input_nilai >= 80 && input_nilai <= 85)
		{
			System.out.println("GRADE A-");
		}
		else if(input_nilai >= 86 && input_nilai <= 95)
		{
			System.out.println("GRADE A");
		}
		else if(input_nilai >= 96 && input_nilai <= 100)
		{
			System.out.println("GRADE A+");
		}
		else {
			System.out.println("NILAI MASUK DALAM RANGE GRADE");
		}
	}
	
	public static void main(String[] args) {
		int nilai;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Masukkan nilai : ");
		nilai = scanner.nextInt();
		
		checkNilai(nilai);

	}

}
