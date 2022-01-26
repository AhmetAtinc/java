package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C06_NestedTernary {

	public static void main(String[] args) {
		//Verilen karakteri inceleyin, Kucuk harf ise consola “Kucuk Harf” , buyuk harfse
		//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.

		
		 
	        char krk = '&';
	        
	        
		//String sonuc= (krk>='a' && krk<='z') ? "Kucuk harf" : (//sart yanlis ise sonuc);
		
	        String sonuc= (krk>='a' && krk<='z') ? "Kucuk harf" : (
	        		      (krk>='A'&& krk<='Z') ?  "Buyuk harf" : "girilen karakter harf degil");
	        		      
		
		
		System.out.println(sonuc);
		
		
		
		
		
		
	}

}
