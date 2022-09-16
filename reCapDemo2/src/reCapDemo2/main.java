package reCapDemo2;

public class main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double total=0;
		double enBuyuk = myList[1];
		
		for (double number:myList) {
			if(enBuyuk < number) {
				enBuyuk = number;
			}
				total = number + total;
				
		}
		System.out.println(enBuyuk);
		System.out.println(total);
	}

}
