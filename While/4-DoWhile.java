package day19_whileLoop_doWhileLoop;

public class C05_DoWhile {

	public static void main(String[] args) {
		//Soru 2 ) ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin.

		//===================    For loop ile   ===================
		for (char i = 'm'; i > 'c'; i--) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		//===================    While loop ile   ===================
		
		char krk='m';
		while (krk>'c') {
			System.out.print(krk+" ");
			krk--;
		}
		System.out.println("");
		//===================   Do While loop ile   ===================
		
		char harf='m';
		do {
			System.out.print(harf+" ");
			harf--;
		} while (harf>'c');
		
		
		
		
		
		
	}

}
