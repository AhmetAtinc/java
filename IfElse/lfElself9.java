package day08_IfElseStatements;

import java.util.Scanner;

public class IfElselfOdev {

	public static void main(String[] args) {
		
		// Kullanicidan gun ismini yazmasini isteyin.
		//Girilen isim geçerli bir gün ise gün isminin 1,2 ve 3. harflerini
		//ilk harf büyük diðer ikisi küçük olarak yazdýrýn.
		//Gün ismi geçerli deðilse "Geçerli gün ismi giriniz " yazdýrýn
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun giriniz :");
		String gun=scan.next();
		
		if (gun.equals("pazartesi") || gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe") || gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar")) 
				{
			System.out.println(gun.toLowerCase()+gun.toUpperCase().substring(0,1)+gun.substring(1,3));
		} else {
			System.out.println("Gecerli bir gun giriniz");
		}
		
		
		
		
		
		
		
		
		
		
	}


	}


