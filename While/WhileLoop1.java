package day18_nestedForLoop_WhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayilar isteyin
		//sayi adedi 10'u gecerse veya toplam 500'u gecerse
		//"Bu kadar sayi yeter"
		//.. adet sayi girdin, toplami.... yazdirin
		
		
		Scanner scan=new Scanner(System.in);
		
	
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		
			while (sayac<10&&toplam<500) {
				System.out.println("toplama eklemek icin sayi girin");
				sayi=scan.nextInt();
				toplam+=sayi;
				sayac++;
			}
			System.out.println("Bu kadar sayi yeter");
	        System.out.println(sayac + ", adet sayi girdiniz ve sayilarin toplami :" + toplam);
	        scan.close();
		
		

	}

}
