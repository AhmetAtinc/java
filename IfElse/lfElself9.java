package day08_IfElseStatements;

import java.util.Scanner;

public class IfElselfOdev {

	public static void main(String[] args) {
		
		// Kullanicidan gun ismini yazmasini isteyin.
		//Girilen isim ge�erli bir g�n ise g�n isminin 1,2 ve 3. harflerini
		//ilk harf b�y�k di�er ikisi k���k olarak yazd�r�n.
		//G�n ismi ge�erli de�ilse "Ge�erli g�n ismi giriniz " yazd�r�n
		
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


