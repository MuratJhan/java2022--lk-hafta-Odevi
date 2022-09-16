package loopDemo;

public class main {

	public static void main(String[] args) {
		//For
		for(int i=1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		int i =2;
		//While
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While Döngüsü Bitti");
		
		//Do White
		int j=1;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}


}
