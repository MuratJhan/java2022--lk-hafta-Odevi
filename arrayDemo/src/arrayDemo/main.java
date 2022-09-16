package arrayDemo;

public class main {

	public static void main(String[] args) {
		// Bir öğretmenin sınıfındaki öğrencileri sıralayalım.
		String Ogrenci1 ="Engin";
		String Ogrenci2 ="Derin";
		String Ogrenci3 ="Salih";
		String Ogrenci4 ="Ahmet"; 
		//Eğer dizinin eleman sayısından fazla eleman girersek ArrayIndexOutOfBoundsException hatası alırız.
		
		System.out.println(Ogrenci1);
		System.out.println(Ogrenci2);
		System.out.println(Ogrenci3);
		System.out.println(Ogrenci4);
		
		System.out.println("----------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) { //öğrenciler dizisindeki her bir elemanı gez demektir.
			System.out.println(ogrenci);
		}
	}

}
