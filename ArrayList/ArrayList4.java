package day25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		
		
		int arr[] ={2,3,4,5,7,9,4,3,6,8,6,5,9,0,8,7,6,5,4,3};
		
		//2,3,4,5,6,7,8,9
		
		List<Integer> tekrarsiz=new ArrayList<>();
		
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
			}
		}
		System.out.println("Tekrarsiz list : "+tekrarsiz); //
		
		int tekrarsizArray[]=new int [tekrarsiz.size()];
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			tekrarsizArray[i]=tekrarsiz.get(i)	;	
			}
		
		System.out.println("Tekrarsiz array : "+Arrays.toString(tekrarsizArray));
	}

}
