package operator_bitwise;

public class Main {

	public static void main(String[] args) {
//		  operator bitwise 
//		  operator yang menangani operator logika bilangan biner
		int a = 181;
		int b = 108;
		int hasil;
		String numb_a, numb_b, result;
		
		numb_a  = Integer.toBinaryString(a);
		numb_b  = Integer.toBinaryString(b);
		hasil = a | b;
		result = Integer.toBinaryString(hasil);
//		1. operator | OR
		System.out.println("menggunakan operator OR | ");
		System.out.println("[a]." + numb_a + "\t= " + a );
		System.out.println("[b]." + numb_b + "\t= " + b);
		System.out.println("------------------------");
		System.out.println("[c]." + result + "\t= " + hasil);
		System.out.println(numb_a + " | " + numb_b + " = " + result);
		 

	}

}
