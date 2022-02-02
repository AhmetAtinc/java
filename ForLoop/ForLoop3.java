package day16_forLoops;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 100'den kucuk bir tamsayi isteyin
		// 1'den baslayarak girilen sayiya kadae (sayi dahil) 3'un kati olan sayilari yazdirin 
		
		 //sayi negatifse veya tam sayi degilse uyari verelim
		
		Scanner scan = new Scanner(System.in);
	    System.out.print("Lutfen yuzden kucuk bir sayi giriniz :");
	    double num=scan.nextDouble();
	    int sayi=(int) num;   
	      
	    if (num<0) {
			System.out.println("negatif sayi giremezsiniz");
		} else if (sayi!=num){
			System.out.println("tam sayi giriniz");
		}else if(sayi>100){
			System.out.println("lutfen 100'den kucuk sayi giriniz");
		}else {

		       for (int i = 1; i <= num; i++) {
				
		    	   if (i%3==0) {
					System.out.print(i+ " ");
				}
			}
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	       
	       
	       
	       
		
		
		
	     
	}	

}
