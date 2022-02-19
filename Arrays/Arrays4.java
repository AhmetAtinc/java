package ahmetDeneme5;

import java.util.Arrays;
import java.util.Scanner;

public class Q2Replit {

	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir cümle alýn. Kullanýcýdan alýnan cümleyi parametre olarak kabul edin, Array kullanarak cümleyi ters çevirin
		 *  ve sonucu ana metoda String olarak döndüren bir Method yazýn.

			Not: Büyük ve küçük harfler, boþluklar ve özel karakterler deðiþtirilmeyecektir.

	Giriþ :    Kod yazmak çok güzel.

Çýktý :		.edoc etirw ot ecin yrev si tI
		 */

//		Scanner scan=new Scanner(System.in);
//		System.out.println("cumle giriniz");
		String arr[]= {"Kod yazmak çok güzel."};
		
		String ters[]=arr[arr.length-1].split("");
		
		for (int i = ters.length-1; i >= 0; i--) {
			
	
			System.out.print(ters[i]+"");
		}
		
		
		
	}

}
