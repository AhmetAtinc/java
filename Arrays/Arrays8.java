package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_MDArrays {

	public static void main(String[] args) {
		//	Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("lutfen bir cumle giriniz :");
//		String str=scan.nextLine();
			
		String cumle="Her sey, Javayla kolay degil mi?";
		
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); //[Her, sey,, Javayla, kolay]
		
		System.out.println("Girilen cumlede "+ kelimeler.length+" adet kelime var");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
