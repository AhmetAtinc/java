package deneme1;

public class DuplicateValueInArray {

	public static void main(String[] args) {
		/*5----
		Tekrar eden sayilari yazdiriniz
		input :  {1,2,3,4,5,6,6}
		output : 6
		*/

		int arr[] = {1,2,3,4,5,6,6};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	

	}

}
