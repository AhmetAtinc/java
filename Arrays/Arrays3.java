package ahmetDeneme5;

import java.util.Arrays;
import java.util.Scanner;

public class Q2Replit {

	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir c�mle al�n. Kullan�c�dan al�nan c�mleyi parametre olarak kabul edin, Array kullanarak c�mleyi ters �evirin
		 *  ve sonucu ana metoda String olarak d�nd�ren bir Method yaz�n.

			Not: B�y�k ve k���k harfler, bo�luklar ve �zel karakterler de�i�tirilmeyecektir.

	Giri� :    Kod yazmak �ok g�zel.

��kt� :		.edoc etirw ot ecin yrev si tI
		 */

//		Scanner scan=new Scanner(System.in);
//		System.out.println("cumle giriniz");
		String arr[]= {"Kod yazmak �ok g�zel."};
		
		String ters[]=arr[arr.length-1].split("");
		
		for (int i = ters.length-1; i >= 0; i--) {
			
	
			System.out.print(ters[i]+"");
		}
		
		
		
	}

}
