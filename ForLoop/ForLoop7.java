package day17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		//Soru  ) Kullanicidan 10’dan kucuk bir tamsayi isteyin
		//ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Faktoriyel hesaplamak icin 10'dan bir sayi giriniz :");
	    int sayi=scan.nextInt();
	    
	    
	    System.out.print(sayi+"!=");
	    int faktoriyel=1;
	    
	    for (int i = sayi; i > 0; i--) {
			faktoriyel*=i;
			System.out.print(i +"*");
		}
	    System.out.println("1="+faktoriyel);
	    
		
		
		
		
		
		
	}

}
