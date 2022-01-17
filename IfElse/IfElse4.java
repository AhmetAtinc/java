package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElse {

	public static void main(String[] args) {
		
		//Kullanicidan bir ucgenin uc kenar uzunlugunu alin eger uc kenar uzunlugu birbirine esit ise ekrana "eskenar ucgen" yazdirin
		//diger durumlarda ekrana "eskenar degil" yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.print("kenar uzunlugu gir :");
		double kenar1=scan.nextDouble();
		
		
		System.out.print("kenar uzunlugu gir :");
		double kenar2=scan.nextDouble();
		
		System.out.print("kenar uzunlugu gir :");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgen");
		} else {
			System.out.println("eskenar degil");
		}
		
	
		        //kisa bicimde kodlanmýs hali
		
		        System.out.print("Lutfen ücgenin kenar uzunluklarini yazýnýz \nilk kenarý girdikten sonra diger kenarlar için enter'e basýn");
		        
		        double kenar4=scan.nextDouble();
		        double kenar5=scan.nextDouble();
		        double kenar6=scan.nextDouble();
		        
		        if (kenar4==kenar5 && kenar5==kenar6) {
		            System.out.println("Eskenar ucgen");
		        } else {
		            System.out.println("Eskenar ucgen degil");
		        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
