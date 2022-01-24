 package day09_NestedIfElse;

public class C03_Ternary {

	public static void main(String[] args) {
		
		
		int x=10;
		
		String tekMiCiftMi=x%2==0 ? "cift sayidir" : "tek sayidir";		
		
		System.out.println(tekMiCiftMi); //cift
		
		System.out.println(x%2==0 ? "cift sayidir" : "tek sayidir");
		
		//ternary iki turlu kullanilir
		//ya donen sonuca gore bir veriable olusturup assing ederiz
		//veya direk syso icine yazip sonucu yazdiririz
		
		
		
		
		// eger ternary de donecek sonuclar ayni data turunden degılse atama yapamayiz
		//sadece syso ile yazdirabiliriz.
		System.out.println(x>5 ? "Aferin" : 4); //Aferin
		//String sonuc = x>5 ? "Aferin" : 4 ;
		
		int y =1;
		int z=1;
		int a = y<10?y++:z++;    //once atama yapar sonra arttirir
		
		System.out.println(y+ ","+z+","+a);
		
		
		
		
		
		
		
	}

}
