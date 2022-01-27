package day14_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		//sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazdirin
		//kullaniciya us sorun
		//iki yazarsa karelerin toplamini yapan method 
		// 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz \nilk sayidan sonra enter'a basin");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		System.out.println("girilen sayilarin kareler toplamini istiyorsaniz2 "
							+"\nkupler toplamini istiyorsaniz 3 e basin");
		
		int secim=scan.nextInt();
		
		switch (secim) {
		case 2:
			kareTopla(sayi1,sayi2);
			break;
		case 3:
			kuptopla(sayi1,sayi2);
			break;
		default:
			System.out.println("hatali giris");
			break;
		}
				
		
		
		/* 
		 Bir method'u dort adimda olustururuz
		 1-methodu javaya olusturmak icin method call yapiyoruz
		 2-arguman ihtiyaci var mi belirleyelim
		 3-javadan yardim alarak method'u olusturalim
		 4-axcess modifier ve return type'a karar ver
		 bundan sonra method'un yapacagi islemi gerceklestirecek kodlarimizi tercih edebiliriz
		 */  
		
	//	kuptopla(sayi1,sayi2);
		scan.close();
	}

	public static void kuptopla(int sayi1, int sayi2) {
		double kuplerToplami=sayi1*sayi1*sayi1+ sayi2*sayi2*sayi2 ;
		System.out.println("girilen sayilarin kuplerinin toplami = "+kuplerToplami);
	}

	public static void kareTopla(int sayi3, int sayi4) {
		// bizim arguman isimlerimizle parametere isimlerimiz ayni olmak zorunda degil
		//java isimlere degil degerlere bakar
		// bu bir zorunluluk degil imkandir istedigimizi tercih edebiliriz
		
		double karelerToplami= sayi3*sayi3+sayi4*sayi4;
		System.out.println("Girilen sayilarin kareleri toplami= " +karelerToplami);
		
	}

}
