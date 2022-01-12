package perulangan;

public class Main4 {
	
	static void looping()
	{
		int i = 0;
		
		String gorengan[] = {"bala-bala", "pisang goreng", "tahu isi"};
		
		
		for(String element : gorengan)
		{
			i++;
			System.out.println("["+ i +"]. " + element);
		}
	}

	public static void main(String[] args) 
	{
		looping();
	}

}
