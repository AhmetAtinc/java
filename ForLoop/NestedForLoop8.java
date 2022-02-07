package day17_forLoops;

import java.util.Iterator;

public class C07_NestedForLoop {

	public static void main(String[] args) {
		
		/*1'den 4' kadar yan yana aralarinda bir bosluk birakarak yazdirin
		1 2 3 4 
		2 4 6 8 
		3 6 9 12 
		4 8 12 16 
		*/
		for (int satir = 1; satir <= 4; satir++) {
			for (int i = 1; i <=4 ; i++) {
				System.out.print(satir*i +" ");
			}
				System.out.println("");
		}
		
		

	}

}
