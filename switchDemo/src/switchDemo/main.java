package switchDemo;

public class main {

	public static void main(String[] args) {
		//Bir öğrencinin sınavdan aldığı puana göre sonuç döndüren program
		char grade = 'C'; //grade = not
		
		switch(grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef : Kaldınız");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");
		}

	}
	//Aynı sonucu vermek istersek aşağıdaki gibi kullanabiliriz.
    /*case 'B':
      case 'C':
        System.out.println("İyi : Geçtiniz");
        break;
    */
}
