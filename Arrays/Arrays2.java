package day21_scope_arrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {

		//soru 2 verilen bir arrayin tum elemanlarini toplayan bir program yaziniz
		
		int arr[]= {3,5,8,65,32,34};
		
		int toplam=0;
		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
		
		System.out.println("elementlerin toplami : "+ toplam);
		
		//arrayin tum elemanlarinin once kucukten buyuye sonra buyukten kucuge yazdirin
		
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//buyukten kucuge yazdirmak icin ya for loop ile elemanlari yazdirabiliriz
		
		for (int i = arr.length-1; i >=0 ; i--) {
			
			System.out.print(arr[i]+" ");
		}
			//array yapmak isterseniz ayni uzunlukta bir array olusturup elemanlari ters sirada yeni bir arraya tasiyabiliriz
		System.out.println();
		int tersArray[]=new int[arr.length];
		
		for (int i = 0; i < tersArray.length; i++) {
			tersArray[i]=arr[arr.length-1-i];
		}
		
		System.out.print(Arrays.toString(tersArray));
		
		
		
	}

}
